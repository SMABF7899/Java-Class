package tamrin2;

import java.util.Scanner;

public class DiamondPrinting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n (0 <= n <= 10): ");
        int n = input.nextInt();
        int diameter = 2 * n + 1;
        if (n >= 1 && n <= 10) {
            for (int i = 1; i <= (diameter / 2) + 1; i++) {
                for (int j = 0; j < (diameter / 2) - i + 1; j++)
                    System.out.print(" ");
                for (int j = 0; j < (2 * i) - 1; j++)
                    System.out.print("*");
                System.out.print("\n");
            }
            for (int i = 1; i <= diameter / 2; i++) {
                for (int j = 0; j < i; j++)
                    System.out.print(" ");
                for (int j = 0; j < diameter - (2 * i); j++)
                    System.out.print("*");
                System.out.print("\n");
            }
        } else
            System.out.println("Your number is out of the range of 1 to 10");
    }
}
