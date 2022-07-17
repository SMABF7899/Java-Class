package FinalProject;

import java.text.SimpleDateFormat;
import java.util.*;

public class Services {

    static int fistDay = 1;
    static int firstHour = 9;
    static int firsMinute = 0;
    static ArrayList<Integer> daysList = new ArrayList<>();
    static ArrayList<Integer> hoursList = new ArrayList<>();
    static ArrayList<Integer> minutesList = new ArrayList<>();
    static ArrayList<Integer> reservedService = new ArrayList<>();

    public static void customDate (String date, String carType, int washingTime, int computingCost, ArrayList<String> servicesList) {
        if (daysList.size() != 0) {
            int flag = daysList.size();
            while (flag != 0) {
                int day = Integer.parseInt(date.split(" ")[0]);
                int hour = Integer.parseInt(date.split(" ")[1].split(":")[0]);
                int minute = Integer.parseInt(date.split(" ")[1].split(":")[1]);
                if (hour >= 21)
                    System.out.println(Color.ANSI_RED + "cannot be reserved" + Color.ANSI_RESET);
                else {
                    int TimeDifference = (hour - hoursList.get(hoursList.size() - flag)) * 60 + (minute - minutesList.get(minutesList.size() - flag));
                    if ((day - daysList.get(daysList.size() - flag) == 0 && TimeDifference <= 0 && Math.abs(TimeDifference) < washingTime) ||
                            (day - daysList.get(daysList.size() - flag) == 0 && TimeDifference >= 0 && TimeDifference < reservedService.get(reservedService.size() - flag))) {
                        System.out.println(Color.ANSI_RED + "cannot be reserved" + Color.ANSI_RESET);
                        break;
                    }
                    else {
                        flag -= 1;
                        if (flag == 0) {
                            daysList.add(Integer.parseInt(date.split(" ")[0]));
                            hoursList.add(Integer.parseInt(date.split(" ")[1].split(":")[0]));
                            minutesList.add(Integer.parseInt(date.split(" ")[1].split(":")[1]));
                            reservedService.add(washingTime);
                            System.out.println(Color.ANSI_GREEN + "reserved (" + date + ")" + Color.ANSI_RESET);
                            System.out.println("Line: " + new Random().nextInt(11));
                            System.out.println("Car Type: " + carType);
                            System.out.println("Services:");
                            for (String s : servicesList)
                                System.out.println("- " + s + " (" + CostOfServices.priceOfEachService(carType, s) + "T)");
                            System.out.println("Total Cost: " + computingCost + "T");
                        }
                    }
                }
            }
        } else {
            if (Integer.parseInt(date.split(" ")[1].split(":")[0]) >= 21)
                System.out.println(Color.ANSI_RED + "cannot be reserved" + Color.ANSI_RESET);
            else {
                daysList.add(Integer.parseInt(date.split(" ")[0]));
                hoursList.add(Integer.parseInt(date.split(" ")[1].split(":")[0]));
                minutesList.add(Integer.parseInt(date.split(" ")[1].split(":")[1]));
                reservedService.add(washingTime);
                System.out.println(Color.ANSI_GREEN + "reserved (" + date + ")" + Color.ANSI_RESET);
                System.out.println("Line: " + new Random().nextInt(11));
                System.out.println("Car Type: " + carType);
                System.out.println("Services:");
                for (String s : servicesList)
                    System.out.println("- " + s + " (" + CostOfServices.priceOfEachService(carType, s) + "T)");
                System.out.println("Total Cost: " + computingCost + "T");
            }
        }
    }

    public static void earliestDate (String carType, int washingTime, int computingCost, ArrayList<String> servicesList) {
        if (daysList.size() != 0) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd HH:mm");
            Calendar calendar = Calendar.getInstance();
            ArrayList<Date> dates = new ArrayList<>();
            for (int i = 0; i < daysList.size(); i++) {
                calendar.set(Calendar.DAY_OF_MONTH, daysList.get(i));
                calendar.set(Calendar.HOUR_OF_DAY, hoursList.get(i));
                calendar.set(Calendar.MINUTE, minutesList.get(i));
                dates.add(calendar.getTime());
            }
            Map<String, Integer> map = new HashMap<String, Integer>();
            for (int i = 0; i < reservedService.size(); i++) {
                map.put(simpleDateFormat.format(dates.get(i)), reservedService.get(i));
            }
            TreeMap<String, Integer> treeMap = new TreeMap<>(map);
            int flag = treeMap.size();
            while (flag != 0) {
                String secondDate = (String) treeMap.keySet().toArray()[treeMap.size() - flag];
                int TimeDifference = (firstHour - Integer.parseInt(secondDate.split(" ")[1].split(":")[0])) * 60 +
                        (firsMinute - Integer.parseInt(secondDate.split(" ")[1].split(":")[1]));
                if ((fistDay - Integer.parseInt(secondDate.split(" ")[0]) == 0 && TimeDifference <= 0 && Math.abs(TimeDifference) < washingTime) ||
                        (fistDay - Integer.parseInt(secondDate.split(" ")[0]) == 0 && TimeDifference >= 0 && TimeDifference < treeMap.get(secondDate))) {
                    if (firsMinute + treeMap.get(secondDate) >= 60) {
                        firsMinute += treeMap.get(secondDate) - 60;
                        firstHour += 1;
                        if (firstHour == 21) {
                            fistDay += 1;
                            firstHour = 9;
                            firsMinute = 0;
                        }
                    } else
                        firsMinute += treeMap.get(secondDate);
                    flag -= 1;
                } else {
                    daysList.add(fistDay);
                    hoursList.add(firstHour);
                    minutesList.add(firsMinute);
                    reservedService.add(washingTime);
                    System.out.println(Color.ANSI_GREEN + "reserved (" + fistDay + " " + firstHour + ":" + firsMinute + ")" + Color.ANSI_RESET);
                    System.out.println("Line: " + new Random().nextInt(11));
                    System.out.println("Car Type: " + carType);
                    System.out.println("Services:");
                    for (String s : servicesList)
                        System.out.println("- " + s + " (" + CostOfServices.priceOfEachService(carType, s) + "T)");
                    System.out.println("Total Cost: " + computingCost + "T");
                    if (firsMinute + washingTime >= 60) {
                        firsMinute += washingTime - 60;
                        firstHour += 1;
                        if (firstHour == 21) {
                            fistDay += 1;
                            firstHour = 9;
                            firsMinute = 0;
                        }
                    } else
                        firsMinute += washingTime;
                    break;
                }
            }
            //treeMap.forEach((key, value) -> System.out.println(key + " " + value));
            //new Random().nextInt(11);
        } else {
            daysList.add(fistDay);
            hoursList.add(firstHour);
            minutesList.add(firsMinute);
            reservedService.add(washingTime);
            System.out.println(Color.ANSI_GREEN + "reserved (" + fistDay + " " + firstHour + ":" + firsMinute + ")" + Color.ANSI_RESET);
            System.out.println("Line: " + new Random().nextInt(11));
            System.out.println("Car Type: " + carType);
            System.out.println("Services:");
            for (String s : servicesList)
                System.out.println("- " + s + " (" + CostOfServices.priceOfEachService(carType, s) + "T)");
            System.out.println("Total Cost: " + computingCost + "T");
            if (firsMinute + washingTime >= 60) {
                firsMinute += washingTime - 60;
                firstHour += 1;
                if (firstHour == 21) {
                    fistDay += 1;
                    firstHour = 9;
                    firsMinute = 0;
                }
            } else
                firsMinute += washingTime;
        }
    }

    public static void reservedList (String date, String carType, int washingTime, int computingCost, ArrayList<String> servicesList) {
        if (!Objects.equals(date, "earliest"))
            customDate(date, carType, washingTime, computingCost, servicesList);
        else
            earliestDate(carType, washingTime, computingCost, servicesList);
    }

    public static void getServicesAndDateAndCarType(String request) {
        if (request.indexOf("earliest") > 0) {
            String date = request.substring(request.indexOf("earliest"), request.indexOf("earliest")+"earliest".length());
            String carType = request.split(" ")[2];
            String service = request.split(" ")[3];
            ArrayList<String> servicesList = new ArrayList<>();
            if (service.indexOf('+') > 0)
                Collections.addAll(servicesList, service.split("\\+"));
            else
                servicesList.add(request.split(" ")[3]);
            reservedList(date, carType, washingTime(servicesList), computingCost(servicesList, carType), servicesList);

        }
        else {
            String date = request.split(" ")[1] + " " + request.split(" ")[2];
            String carType = request.split(" ")[3];
            String service = request.split(" ")[4];
            ArrayList<String> servicesList = new ArrayList<>();
            if (service.indexOf('+') > 0)
                Collections.addAll(servicesList, service.split("\\+"));
            else
                servicesList.add(request.split(" ")[4]);
            reservedList(date, carType, washingTime(servicesList), computingCost(servicesList, carType), servicesList);
        }
    }

    public static int washingTime (ArrayList<String> servicesList) {
        int washingTime = 0;
        for (String s : servicesList) {
            switch (s) {
                case "rooshooyi" -> washingTime += PeriodOfTimeServices.rooshooyi;
                case "nezafat" -> washingTime += PeriodOfTimeServices.nezafat;
                case "sefrshooyi" -> washingTime += PeriodOfTimeServices.sefrshooyi;
                default -> System.out.println(Color.ANSI_RED + "Error calling your request. Error number 3" + Color.ANSI_RESET);
            }
        }
        return washingTime;
    }

    public static int computingCost (ArrayList<String> servicesList, String carType) {
        int computingCost = 0;
        for (String s : servicesList) {
            switch (carType) {
                case "sedan" -> {
                    switch (s) {
                        case "rooshooyi" -> computingCost += CostOfServices.sedan_rooshooyi;
                        case "nezafat" -> computingCost += CostOfServices.sedan_nezafat;
                        case "sefrshooyi" -> computingCost += CostOfServices.sedan_sefrshooyi;
                        default -> System.out.println(Color.ANSI_RED + "Error calling your request. Error number 41" + Color.ANSI_RESET);
                    }
                }
                case "hatchback" -> {
                    switch (s) {
                        case "rooshooyi" -> computingCost += CostOfServices.hatchback_rooshooyi;
                        case "nezafat" -> computingCost += CostOfServices.hatchback_nezafat;
                        case "sefrshooyi" -> computingCost += CostOfServices.hatchback_sefrshooyi;
                        default -> System.out.println(Color.ANSI_RED + "Error calling your request. Error number 42" + Color.ANSI_RESET);
                    }
                }
                case "suv" -> {
                    switch (s) {
                        case "rooshooyi" -> computingCost += CostOfServices.suv_rooshooyi;
                        case "nezafat" -> computingCost += CostOfServices.suv_nezafat;
                        case "sefrshooyi" -> computingCost += CostOfServices.suv_sefrshooyi;
                        default -> System.out.println(Color.ANSI_RED + "Error calling your request. Error number 43" + Color.ANSI_RESET);
                    }
                }
                default -> System.out.println(Color.ANSI_RED + "Error calling your request. Error number 4" + Color.ANSI_RESET);
            }
        }
        return computingCost;
    }
}
