package tamrin3;

import java.util.ArrayList;
import java.util.Scanner;

public class GiveOrder {
    public static void main(String[] args) {
        boolean state = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Your order should be in the format '<Your Character> <Your Number>'");
        do {
            System.out.print("Enter your order : ");
            String order = input.nextLine();
            if (order.toUpperCase().charAt(0) == 'F' || order.toUpperCase().charAt(0) == 'P' || order.toUpperCase().charAt(0) == 'B') {
                switch (order.toUpperCase().charAt(0)) {
                    case 'F' -> System.out.println(F(Integer.parseInt(order.split(" ")[1])));
                    case 'P' -> System.out.println(P(Integer.parseInt(order.split(" ")[1])));
                    case 'B' -> System.out.println(B(Integer.parseInt(order.split(" ")[1])));
                    default -> System.out.println("Noting");
                }
            }
        } while (state);
    }

    static String F(int x) {
        if (x == 0)
            return "0";
        if (x == 1)
            return "1 & 2";
        int num1 = 0, num2 = 1, num3 = 0, i = 2;
        while (num3 <= x) {
            num3 = num1 + num2;
            if (num3 == x) {
                return Integer.toString(i);
            }
            num1 = num2;
            num2 = num3;
            i++;
        }
        return "wrong";
    }

    static String P(int x) {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 1; i <= x; i++) {
            if (i != 0 && i != 1 && isPrime(i))
                primes.add(i);
        }
        if (x == primes.get(primes.size() - 1))
            return Integer.toString(primes.size());
        return "wrong";
    }

    static Object B(int x) {
        String y = F(x);
        String z = P(x);
        if (!y.equals("wrong") && !z.equals("wrong")) {
            ArrayList<Integer> primes = new ArrayList<>();
            primes.add(1);
            int n = Integer.parseInt(y) + Integer.parseInt(z);
            while (n % 2 == 0) {
                primes.add(2);
                n /= 2;
            }
            for (int i = 3; i <= Math.sqrt(n); i+=2) {
                while (n % i == 0) {
                    primes.add(i);
                    n /= i;
                }
            }
            if (n > 2)
                primes.add(n);
            else
                primes.add(Integer.parseInt(y) + Integer.parseInt(z));
            return primes;
        }
        return "wrong";
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
