package com.company;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

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

        ArrayList<Integer> days = new ArrayList<>();
        days.add(1);
        days.add(1);
        days.add(1);
        days.add(3);
        days.add(5);
        days.add(3);
        days.add(3);
        days.add(5);
        days.add(3);
        days.add(3);
        days.add(10);
        days.add(10);
        days.add(5);
        for (int i = 0; i < days.size(); i++) {
            if (days.get(i).equals(5))
                System.out.println(i);
        }
    }
}
