import java.util.*;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println(factorial_iterative(5));
        System.out.println(xPowern(2, 0));
        System.out.println(countDigits(123));
        System.out.println(isPrime(27));
        System.out.println(gcd(2, 8));
    }

    public static int factorial_iterative(int n) {
        if (n <= 1) return 1;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int xPowern(int x, int n) {
        int result = x;
        if (n == 0) return x;
        for (int i = 1; i < n; i++) {
            result *= x;
        }
        return result;
    }

    public static int countDigits(int n) throws IllegalArgumentException{
        int count = 0;
        if (n <= 0) throw new IllegalArgumentException("Invalid input");
        while (n > 0) {
            ++count;
            n /= 10;
        }
        return count;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int gcd(int a, int b) {
        int divisor = a > b ? b : a;
        while (b > 0) {
            int num = a % b;
            a = b;
            b = num;
        }
        return a;
    }
}