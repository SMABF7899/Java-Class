package FinalProject;

import java.util.ArrayList;
import java.util.Collections;

public class Services {

//    rooshooyi = 15
//    nezafat = 20
//    sefrshooyi = 60

    public static void reservedList (String date) {
        ArrayList<String> reservedList = new ArrayList<>();
        reservedList.add("1 9:00");
    }

    public static void getServicesAndDate(String request) {
        if (request.indexOf("earliest") > 0) {
            String date = request.substring(request.indexOf("earliest"), request.indexOf("earliest")+"earliest".length());
            String service = request.split(" ")[2];
            ArrayList<String> servicesList = new ArrayList<>();
            if (service.indexOf('+') > 0)
                Collections.addAll(servicesList, service.split("\\+"));
            System.out.println(Services.washingTime(servicesList));
            //System.out.println(date);
            //System.out.println(servicesList);

        }
        else {
            String date = request.split(" ")[1] + " " + request.split(" ")[2];
            String service = request.split(" ")[3];
            ArrayList<String> servicesList = new ArrayList<>();
            if (service.indexOf('+') > 0)
                Collections.addAll(servicesList, service.split("\\+"));
            Services.washingTime(servicesList);
//            System.out.println(date);
//            System.out.println(servicesList);
        }
    }

    public static int washingTime (ArrayList<String> servicesList) {
        int washingTime = 0;
        for (int i = 0; i < servicesList.size(); i++) {
            switch (servicesList.get(i)) {
                case "rooshooyi" -> washingTime += 15;
                case "nezafat" -> washingTime += 20;
                case "sefrshooyi" -> washingTime += 60;
                default -> System.out.println("Error calling your request. Error number 3");
            }
        }
        return washingTime;
    }
}
