package tamrin2;

import java.util.Scanner;

public class SingleDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = input.nextInt();
        int sum = 0;
        do {
            sum = 0;
            int length = String.valueOf(n).length();
            for (int i = 0; i < length; i++) {
                char figure = String.valueOf(n).charAt(i);
                sum += Integer.parseInt(String.valueOf(figure));
            }
            if (sum >= 10)
                n = sum;
        } while (sum >= 10);
        System.out.println(sum);
    }
}
