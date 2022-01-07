package com.company;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LargestPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n : ");
        long n = input.nextLong();
        ArrayList<Long> primes = new ArrayList<>();
        while (n % 2 == 0) {
            primes.add(2L);
            n /= 2;
        }
        for (int i = 3; i <= Math.sqrt(n); i+=2) {
            while (n % i == 0) {
                primes.add((long) i);
                n /= i;
            }
        }
        if (n > 2)
            primes.add(n);
        System.out.println(Collections.max(primes));
    }
}
