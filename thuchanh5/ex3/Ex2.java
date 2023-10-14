package ex3;

public class Ex2 {
    public static int f1_iter(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += (int)Math.pow(2, i);
        return sum;
    }

    public static int f1_recur(int n) {
        if (n == 0) return 0;
        return (int) Math.pow(2, n) + f1_recur(n - 1);
    }

    public static double f2_iter(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++)
            sum += (double) (i + 1) / 2;
        return sum;
    }
    public static double f2_recur(int n) {
        if (n == 0) return 0;
        return (double) (n + 1) / 2 + f2_recur(n - 1);
    }

    private static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static double f3_iter(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++)
            sum += (double) factorial(i) / factorial(i - 1);
        return sum;
    }

    public static double f3_recur(int n) {
        if (n == 1) return 1;
        return (double) factorial(n) / factorial(n - 1) + f3_recur(n - 1);
    }

    public static int f4_iter(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i*(i + 1);
        return sum;
    }

    public static int f4_recur(int n) {
        if (n == 1) return 2;
        return n * (n + 1) + f4_recur(n - 1);
    }

    public static long f5_iter(int n) {
        long  sum = 1;
        for (int i = 1; i <= n; i++)
            sum *= i;
        return sum;
    }

    public static long f5_recur(int n) {
        if (n == 1) return 1;
        return n * f5_recur(n - 1);
    }
}
