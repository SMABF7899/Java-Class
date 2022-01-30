package tamrin4;

import java.util.Scanner;

public class Period {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size (n) and number of questions (N) : ");
        String entrance = input.nextLine();
        int n = Integer.parseInt(entrance.split(" ")[0]);
        int N = Integer.parseInt(entrance.split(" ")[1]);
        System.out.print("Enter " + n + " numbers : ");
        String numbers = input.nextLine();
        int[] numbersList = new int[n];
        String[] periods = new String[n];
        for (int i = 0; i < n; i++) {
            numbersList[i] = Integer.parseInt(numbers.split(" ")[i]);
        }
        for (int i = 0; i < N; i++) {
            System.out.print("Enter question " + (i + 1) + " : ");
            periods[i] = input.nextLine();
        }
        for (int i = 0; i < N; i++) {
            System.out.println(additionOfIntervalNumbers(Integer.parseInt(periods[i].split(" ")[0]), Integer.parseInt(periods[i].split(" ")[1]), numbersList));
        }
    }

    static int additionOfIntervalNumbers (int a, int b, int[] numbers) {
        int sum = 0;
        for (int i = a; i <= b; i++)
            sum += numbers[i];
        return sum;
    }
}
