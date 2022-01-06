package tamrin2;

import java.util.Scanner;

public class WorkReport {
    public static void main(String[] args) {
        int total = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of bottles (n) : ");
        int n = input.nextInt();
        System.out.print("Enter volume amount (k) : ");
        int k = input.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Bottle volume " + (i + 1) + " : ");
            c[i] = input.nextInt();
            total += c[i];
        }
        if (total >= k) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
