package tamrin1;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = scanner.nextInt();
        System.out.print("Enter b : ");
        int b = scanner.nextInt();
        System.out.print("Enter c : ");
        int c = scanner.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            int p = (a + b + c) / 2;
            double s = (double) Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Area of the triangle is " + s);
        } else {
            System.out.println("This triangle is not defined");
        }
    }
}
