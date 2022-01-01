package com.company;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        long s = 0, x = 0, y = 1, z = 0;
        while (z < 4000000) {
            z = x + y;
            //System.out.println(z);
            if (z % 2 == 0)
                s = s + z;
            x = y;
            y = z;
        }
        System.out.println(s);
    }
}
