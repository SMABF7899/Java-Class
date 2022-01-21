package tamrin3;

import java.util.Scanner;

public class NotTailRecursion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Your number should be from 2 to 200");
        System.out.print("Enter your number : ");
        int x = input.nextInt();
        if (x >= 2 && x <= 200) {
            for (int i = 1; i <= x; i++)
                System.out.print(i + " , ");
            for (int i = x - 1; i > 0; i--) {
                System.out.print(i);
                if (i != 1)
                    System.out.print(" , ");
            }
        } else
            System.out.println("Didn't I tell you to enter from 2 to 200?");
    }
}
