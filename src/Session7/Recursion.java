package Session7;

public class Recursion {
    public static void main(String[] args) {
        int n = 100;
        System.out.println(fib(n));
    }

    static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
}
