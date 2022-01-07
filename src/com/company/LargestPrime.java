package com.company;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class LargestPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n : ");
        long n = input.nextLong();
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i+=2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        if (n > 2)
            System.out.print(n);
    }
}
