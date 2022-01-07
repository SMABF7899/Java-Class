package tamrin2;

import java.util.Scanner;

public class SingleDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n : ");
        long n = input.nextLong();
        long sum = 0;
        do {
            sum = 0;
            long length = String.valueOf(n).length();
            for (long i = 0; i < length; i++) {
                char figure = String.valueOf(n).charAt((int) i);
                sum += Integer.parseInt(String.valueOf(figure));
            }
            if (sum >= 10)
                n = sum;
        } while (sum >= 10);
        System.out.println(sum);
    }
}
