package com.company;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Test {
    public static void main(String[] args) throws Exception{
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Are you admin? ");
//        String isAdmin = scanner.next();
//        File file = new File("/Users/smabf/Desktop/Password.txt");
//        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
//        String newPass = bufferedReader.readLine();
//        if (Objects.equals(isAdmin.toUpperCase(Locale.ROOT), "YES")) {
//            System.out.print("Enter Admin Password : ");
//            String password = scanner.next();
//            if (Objects.equals(password, newPass))
//                System.out.println(true);
//            else
//                System.out.println(false);
//        } else
//            System.out.println("You are not admin");

//        ArrayList<Integer> days = new ArrayList<>();
//        days.add(1);
//        days.add(1);
//        days.add(1);
//        days.add(3);
//        days.add(5);
//        days.add(3);
//        days.add(3);
//        days.add(5);
//        days.add(3);
//        days.add(3);
//        days.add(10);
//        days.add(10);
//        days.add(5);
//        for (int i = 0; i < days.size(); i++) {
//            if (days.get(i).equals(5))
//                System.out.println(i);
//        }
        //System.out.println(2 + "" + 5);
        SimpleDateFormat SimpleDateFormat = new SimpleDateFormat("dd HH:mm");
//        Date date = new Date();
//        date.setTime(1000);
//        Time time = new Time(8000);
//        System.out.println(time);
        ArrayList<Date> dates = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 9);
        calendar.set(Calendar.MINUTE, 25);
        Date date1 = calendar.getTime();
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        calendar.set(Calendar.HOUR_OF_DAY, 10);
        calendar.set(Calendar.MINUTE, 40);
        Date date2 = calendar.getTime();
        calendar.set(Calendar.DAY_OF_MONTH, 3);
        calendar.set(Calendar.HOUR_OF_DAY, 10);
        calendar.set(Calendar.MINUTE, 20);
        Date date3 = calendar.getTime();
        dates.add(date1);
        dates.add(date3);
        dates.add(date2);
        Collections.sort(dates);
        System.out.println(Math.abs(date1.getTime() - date2.getTime())/60000);
    }
}
