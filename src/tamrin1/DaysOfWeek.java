package tamrin1;

import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x : ");
        int dayOfWeek = scanner.nextInt();
        switch (dayOfWeek) {
            case 1 -> System.out.println("Saturday");
            case 2 -> System.out.println("Sunday");
            case 3 -> System.out.println("Monday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Wednesday");
            case 6 -> System.out.println("Tuesday");
            case 7 -> System.out.println("Friday");
            default -> System.out.println("please inter current number");
        }
    }
}
