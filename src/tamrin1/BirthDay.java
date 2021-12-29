package tamrin1;

import java.util.Scanner;

public class BirthDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x = ");
        String x = scanner.nextLine();
        System.out.println("Year : " + x.charAt(0) + x.charAt(1));
        System.out.println("Month : " + x.charAt(2) + x.charAt(3));
    }
}