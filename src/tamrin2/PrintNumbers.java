package tamrin2;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = input.nextInt();
        int length = String.valueOf(n).length();
        for (int i = 0; i < length; i++) {
            char x = String.valueOf(n).charAt(i);
            System.out.print(x + ": ");
            for (int j = 1; j <= Integer.parseInt(String.valueOf(x)); j++) {
                System.out.print(x);
            }
            System.out.print("\n");
        }
    }
}
