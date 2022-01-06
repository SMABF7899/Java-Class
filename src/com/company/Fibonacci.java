package com.company;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        long sum = 0, num1 = 0, num2 = 1, num3 = 0;
        while (num3 < 4000000) {
            num3 = num1 + num2;
            //System.out.println(z);
            if (num3 % 2 == 0)
                sum += num3;
            num1 = num2;
            num2 = num3;
        }
        System.out.println(sum);
    }
}
