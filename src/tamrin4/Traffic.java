package tamrin4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Traffic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of cars : ");
        int n = input.nextInt();
        ArrayList<Integer> registrationCodes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter registration code " + (i + 1) + " : ");
            registrationCodes.add(input.nextInt());
        }
        ArrayList<Integer> waitStreet = new ArrayList<>();
        int flag = 1;
        int[][] matrix = new int[n][2];
        for (int i = 0; i < n; i++) {
            matrix[i][0] = registrationCodes.get(i);
            matrix[i][1] = motahariToBeheshti();
        }
        while (flag <= n) {
            for (int i = 0; i < registrationCodes.size(); i++) {
                if (registrationCodes.get(i) == flag) {
                    if (matrix[i][1] != beheshtiToMotahari()) {
                        System.out.println(registrationCodes.get(i) + " " + beheshtiToRace());
                        matrix[i][1] = beheshtiToRace();
                    } else {
                        System.out.println(registrationCodes.get(i) + " " + motahariToRace());
                        matrix[i][1] = motahariToRace();
                    }
                    flag ++;
                } else {
                    if (matrix[i][1] != beheshtiToMotahari()) {
                        System.out.println(registrationCodes.get(i) + " " + beheshtiToMotahari());
                        matrix[i][1] = beheshtiToMotahari();
                    } else {
                        System.out.println(registrationCodes.get(i) + " " + motahariToBeheshti());
                        matrix[i][1] = motahariToBeheshti();
                    }
                    waitStreet.add(0, registrationCodes.get(i));
                }
            }
            registrationCodes.clear();
            registrationCodes.addAll(waitStreet);
            waitStreet.clear();
        }
    }

    static int beheshtiToRace () {
        return 1;
    }

    static int motahariToRace () {
        return 2;
    }

    static int beheshtiToMotahari () {
        return 3;
    }

    static int motahariToBeheshti () {
        return 4;
    }
}
