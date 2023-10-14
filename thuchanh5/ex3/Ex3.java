package ex3;

public class Ex3 {
    public static double fa_iter(int n) {
        double result = 0;
        double tmp = 2;
        for (int i = 1; i <= n; i++){
            result = 2 - (1.0 / 2) * tmp;
            tmp = result;
        }
        return result;
    }

    public static double fa_recur(int n) {
        if (n == 0) return 2;
        return 2 - 1.0/2 * fa_recur(n - 1);
    }

    public static double fb_iter(int n) {
        int result = 0;
        int tmp = 1;
        while (n >= 10) {
            result =  1 + tmp;
            tmp = result;
            n /= 10;
        }
        return result;
    }

    public static double fb_recur(int n) {
        if (n < 10) return 1;
        return 1 + fb_recur(n / 10);
    }

    public static double fc_iter(int n, int k) {
        double result = 0;
        double tmp = 1;
        for (int i = 1; i <= k; i++) {
            result = n + tmp;
            tmp = result;
        }
        return result;
    }

    public static double fc_recur(int n, int k) {
        if (k == 1) return n;
        return n + fc_recur(n, k - 1);
    }

    public static double fd_iter(int n) {
        int result = 0;
        int f1 = 0;
        int f2 = 1;
        for (int i = 3; i <= n; i++) {
            result = f1 + f2;
            f1 = f2;
            f2 = result;
        }
        return result;
    }
    public static double fd_recur(int n) {
        if (n == 1 || n == 2) return 1;
            return fd_recur(n - 1) + fd_recur(n - 2);
    }
    public static void main(String[] args) {
        System.out.println(fa_iter(5));
        System.out.println(fa_recur(5));
        System.out.println(fb_iter(1234));
        System.out.println(fb_recur(1234));
        System.out.println(fc_iter(5, 3));
        System.out.println(fc_recur(5, 3));
        System.out.println(fd_iter(5));
        System.out.println(fd_recur(5));
    }
}
