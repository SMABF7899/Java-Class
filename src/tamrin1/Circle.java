package tamrin1;

import java.lang.Math.*;
import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter r = ");
        int r = scanner.nextInt();
        System.out.println("Perimeter of the circle is " + 2 * Math.PI * r);
        System.out.println("Area of the circle is " + r * r * Math.PI);
    }
}
