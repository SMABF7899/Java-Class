package tamrin1;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter r : ");
        int r = scanner.nextInt();
        System.out.print("Enter c : ");
        int c = scanner.nextInt();
        if (c <= 10 && c > 0) {
            System.out.println("Right " + Math.abs(r - 11) + " " + c);
        } else {
            System.out.println("Left " + Math.abs(r - 11) + " " + Math.abs(c - 21));
        }
    }
}
