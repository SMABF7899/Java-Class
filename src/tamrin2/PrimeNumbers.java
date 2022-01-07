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
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = a; i <= b; i++) {
            if (i != 0 && i != 1 && isPrime(i))
                primes.add(i);
        }
        System.out.println(primes);
    }
    public static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
