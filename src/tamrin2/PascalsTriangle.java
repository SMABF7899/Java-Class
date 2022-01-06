package tamrin2;

import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = input.nextInt();
        long p = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(Factorial(i) / (Factorial(j) * Factorial(i - j)) + " ");
            }
            System.out.print("\n");
        }
    }
    static long Factorial(int n) {
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
