package com.company;

import Session8.Employee;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("سلام ایرانی . به جاوا خوش اومدی :)");
        //int i = 0;
//        while (i < 100) {
//            System.out.println(i);
//            i ++;
//        }
//        do {
//            System.out.println(i);
//            i ++;
//        } while (i < 10);
//        for (int j = 0; j < 10; j++) {
//            System.out.println(j);
//        }

//        String[] phones = {"iPhone X", "Samsung S8", "GLX Shahin 3"};
//        for (String phone : phones) {
//            if (phone.startsWith("i")) {
//                System.out.println(phone);
//            }
//        }

//        for (int j = 0; j <= 10; j+=2) {
//            System.out.println(j);
//        }
//        int s = 0;
//        for (int i = 0; i < 1000; i++) {
//            if (i % 3 == 0 || i % 5 == 0) {
//                s = s + i;
//            }
//        }
//        System.out.println(s);
//        int s = 0;
//        int j = 1;
//        for (int i = 1; i < 4000000; i++) {
//            j = j + i;
//            if (j % 2 == 0)
//                s = s + j;
//        }
//        System.out.println(s);
        Scanner scanner = new Scanner(System.in);
//        int x;
//        do {
//            System.out.print("Enter x : ");
//            x = scanner.nextInt();
//        } while ((int) Math.sqrt(x) != Math.sqrt(x));
//        System.out.println(x);
//        System.out.print("Enter row : ");
//        int row = scanner.nextInt();
//        System.out.print("Enter column : ");
//        int column = scanner.nextInt();
//        int[][] matrix = new int[row][column];
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < column; j++) {
//                System.out.print("Enter matrix [" + (i + 1) + "][" + (j + 1) + "] : ");
//                matrix[i][j] = scanner.nextInt();
//            }
//        }
//        System.out.println(Arrays.deepToString(matrix));

        ArrayList<String> names = new ArrayList<>();
        names.add("Ali");
        names.add("Mohammad");
        names.add("Fatemeh");
        names.add("Hassan");
        names.add("حسین");
        names.add("Erfan");
        Collections.sort(names);
        if (names.contains("حسین"))
            System.out.println(names);
        System.out.println(names.get(2));
        System.out.println(names.indexOf("حسین"));
        for (String name : names) {
            if (name.toLowerCase().contains("M".toLowerCase()))
                System.out.println(name);
        }
        System.out.println(f(10));
        System.out.println(g(10));
        Session8.Employee employee = new Session8.Employee("A", 1, 100, 20000000);
        //System.out.println(employee.name);
        employee.setName("بنی");
    }

    static int f(int x) {
        return 2 * x;
    }

    static int g(int x) {
        return 3 * x;
    }
}
