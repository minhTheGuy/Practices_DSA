public class Ex4 {
    public static void main (String[] args) {
        System.out.println(fA(5));
        System.out.println(fB(4));
        System.out.println(fC(3));
        System.out.println(fD(5, 2));
        System.out.println(fE(5));
    }

    public static int fA(int n) {
        if (n < 1) return 0;
        return 2*n + 1 + fA(n-1);
    }

    public static int factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static int fB(int n) {
        if (n < 1) return 0;
        return factorial(n) + fB(n - 1);
    }

    public static int fC(int n) {
        if (n < 1) return 1;
        return factorial(n) * fB(n - 1);
    }

    public static int fD(int n, int r) {
        if (n >= r && r > 0)
        return (n-r+1)*fD(n, r - 1);
        return 1;
    }

    public static double fE(int n) {
        if (n == 1) return 3;
        return Math.pow(2, n) + n * n + fE(n - 1);
    }

}