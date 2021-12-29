package tamrin1;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x = ");
        int x = scanner.nextInt();
        if ( x % 2 == 0) {
            System.out.println("Number " + x + " is even.");
        } else {
            System.out.println("Number " + x + " is odd");
        }
    }
}