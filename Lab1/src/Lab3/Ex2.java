public class Ex2 {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(xPowerN(2, 4));
        System.out.println(countDigits(123));
        System.out.println(gcd(16, 7));
    }

    public static int factorial(int n) {
        if (n == 0) return 1;
        return n*factorial(n-1);
    }

    public static int xPowerN(int x, int n) {
        if (n == 0) return 1;
        return x*xPowerN(x, n - 1);
    }

    public static int countDigits(int n) {
        if (n == 0) return 0;
        return 1 + countDigits(n / 10);
    }
    
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}