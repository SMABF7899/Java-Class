package FinalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Objects;

public class Services {

    final static int rooshooyi = 15;
    final static int nezafat = 20;
    final static int sefrshooyi = 60;
    static int fistDay = 1;
    static int firstHour = 9;
    static int firsMinute = 0;
    static ArrayList<Integer> daysList = new ArrayList<>();
    static ArrayList<Integer> hoursList = new ArrayList<>();
    static ArrayList<Integer> minutesList = new ArrayList<>();
    static ArrayList<Integer> reservedService = new ArrayList<>();

    public static void reservedList (String date, int washingTime) {
        if (!Objects.equals(date, "earliest")) {
            if (daysList.size() != 0) {
                int flag = daysList.size();
                while (flag != 0) {
                    int day = Integer.parseInt(date.split(" ")[0]);
                    int hour = Integer.parseInt(date.split(" ")[1].split(":")[0]);
                    int minute = Integer.parseInt(date.split(" ")[1].split(":")[1]);
                    int TimeDifference = (hour - hoursList.get(hoursList.size() - flag)) * 60 + (minute - minutesList.get(minutesList.size() - flag));
                    if ((day - daysList.get(daysList.size() - flag) == 0 && TimeDifference < 0 && Math.abs(TimeDifference) < washingTime) ||
                            (day - daysList.get(daysList.size() - flag) == 0 && TimeDifference > 0 && TimeDifference < reservedService.get(reservedService.size() - flag))) {
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
                        }
                    }
                }
            } else {
                daysList.add(Integer.parseInt(date.split(" ")[0]));
                hoursList.add(Integer.parseInt(date.split(" ")[1].split(":")[0]));
                minutesList.add(Integer.parseInt(date.split(" ")[1].split(":")[1]));
                reservedService.add(washingTime);
                System.out.println(Color.ANSI_GREEN + "reserved (" + date + ")" + Color.ANSI_RESET);
            }
        } else {
            ArrayList<Integer> newDay = new ArrayList<>(daysList);
            ArrayList<Integer> newHours = new ArrayList<>(hoursList);
            ArrayList<Integer> newMinutes = new ArrayList<>(minutesList);
            int flag = newDay.size();
            newDay.indexOf(Collections.min(newDay));
            while (flag != 0) {
                if (fistDay - Collections.min(newDay) == 0 &&
                        (Math.abs(firstHour - Collections.min(newHours)) * 60 + Math.abs(firsMinute - Collections.min(newMinutes) + reservedService.get(newDay.indexOf(Collections.min(newDay)))) < washingTime)) {
                    flag -= 1;
                    fistDay = Collections.min(newDay);
                    firstHour = Collections.min(newHours);
                    firsMinute = Collections.min(newMinutes);
                    newDay.remove(Collections.min(newDay));
                    newHours.remove(Collections.min(newHours));
                    newMinutes.remove(Collections.min(newMinutes));
                    if (flag == 0) {
                        //
                    }
                } else {
                    daysList.add(Collections.min(newDay));
                    if (washingTime >= 60) {
                        hoursList.add(Collections.min(newHours) + 1);
                    }
                }
            }
        }
//        System.out.println("daysList : " + daysList);
//        System.out.println("hoursList : " + hoursList);
//        System.out.println("minutesList : " + minutesList);
//        System.out.println("reservedService : " + reservedService);
    }

    public static void getServicesAndDate(String request) {
        if (request.indexOf("earliest") > 0) {
            String date = request.substring(request.indexOf("earliest"), request.indexOf("earliest")+"earliest".length());
            String service = request.split(" ")[2];
            ArrayList<String> servicesList = new ArrayList<>();
            if (service.indexOf('+') > 0)
                Collections.addAll(servicesList, service.split("\\+"));
            else
                servicesList.add(request.split(" ")[2]);
            reservedList(date, washingTime(servicesList));

        }
        else {
            String date = request.split(" ")[1] + " " + request.split(" ")[2];
            String service = request.split(" ")[3];
            ArrayList<String> servicesList = new ArrayList<>();
            if (service.indexOf('+') > 0)
                Collections.addAll(servicesList, service.split("\\+"));
            else
                servicesList.add(request.split(" ")[3]);
            reservedList(date, washingTime(servicesList));
        }
    }

    public static int washingTime (ArrayList<String> servicesList) {
        int washingTime = 0;
        for (int i = 0; i < servicesList.size(); i++) {
            switch (servicesList.get(i)) {
                case "rooshooyi" -> washingTime += rooshooyi;
                case "nezafat" -> washingTime += nezafat;
                case "sefrshooyi" -> washingTime += sefrshooyi;
                default -> System.out.println("Error calling your request. Error number 3");
            }
        }
        return washingTime;
    }
}
