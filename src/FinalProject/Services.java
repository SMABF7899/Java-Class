package FinalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Services {

    final static int rooshooyi = 15;
    final static int nezafat = 20;
    final static int sefrshooyi = 60;

    public static void reservedList (String date, int washingTime) {
        ArrayList<String> reservedDate = new ArrayList<>();
        ArrayList<Integer> reservedService = new ArrayList<>();
        reservedDate.add("1 9:00");
        reservedService.add(15);
        if (!Objects.equals(date, "earliest")) {
            int SecondaryTime = Integer.parseInt(date.split(" ")[0] + date.split(" ")[1].split(":")[0] + date.split(" ")[1].split(":")[1]);
            for (int i = 0; i < reservedDate.size(); i++) {
                int EarlyTime = Integer.parseInt( reservedDate.get(i).split(" ")[0] + reservedDate.get(i).split(" ")[1].split(":")[0] + reservedDate.get(i).split(" ")[1].split(":")[1]);
                if (SecondaryTime - EarlyTime >= reservedService.get(i)) {
                    reservedDate.add(date);
                    reservedService.add(washingTime);
                    System.out.println("reserved (" + date + ")");
                    break;
                }
                else
                    System.out.println("cannot be reserved");
            }
        }
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
            System.out.println(washingTime(servicesList));

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
