package Session7;

import java.util.Random;

public class main7 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println(multipleByTwo(4));
        System.out.println(calculateAreaCircle(10));
        System.out.println(generateRandomNumber());
        System.out.println(starGenerator(10));
        System.out.println(seyHello("Bani"));
        System.out.println(seyHello("Seyed Mohammad Ali", "Bani Fatemi"));
        Apple apple = new Apple("red", "test", 120, 150);
        Apple iPhone = new Apple("black", "test2", 14, 55);
        System.out.println(apple.color);
        apple.price = 35000;
        System.out.println(apple.price);
        printInfo(apple);
        printInfo(iPhone);
    }

    static int multipleByTwo(int x) {
        return x * 2;
    }

    static float calculateAreaCircle (int r) {
        return (float) (Math.PI * r * r);
    }

    static float generateRandomNumber() {
        Random random = new Random();
        int x = 10;
        float f1 = random.nextFloat();
        int i1 = random.nextInt();
        return x * i1 * f1;
    }

    static String starGenerator(int x) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < x; i++) {
            result.append("*");
        }
        return result.toString();
    }

    static String seyHello(String firstName, String lastName) {
        return "Hello " + firstName + " " + lastName;
    }

    static String seyHello(String firstName) {
        return "Hello " + firstName;
    }
    static void printInfo(Apple iPhone) {
        System.out.println("Color: " + iPhone.color + "\tPrice: " + iPhone.price);
    }
}
