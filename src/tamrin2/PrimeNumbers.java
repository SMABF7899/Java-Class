package tamrin2;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = input.nextInt();
        System.out.print("Enter b : ");
        int b = input.nextInt();
        int n = (b - a) + 1;
        int[] numbers = new int[n];
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers[i] = a + i;
        }
        for (int i = 0; i < n; i++) {
            if (numbers[i] == 2)
                primeNumbers.add(numbers[i]);
            if (numbers[i] == 3)
                primeNumbers.add(numbers[i]);
            else if (numbers[i] != 1 && ((numbers[i] + 1) % 6 == 0 || (numbers[i] - 1) % 6 == 0))
                primeNumbers.add(numbers[i]);
        }
        System.out.println(primeNumbers);
    }
}
