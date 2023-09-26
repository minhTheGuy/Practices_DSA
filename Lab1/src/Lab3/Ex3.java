public class Ex3 {
    public static void main(String[] args) {
        System.out.println(checkPrime(12, 11));
    }

    public static boolean checkPrime(int n, int d) {
        if (d < 2) return true;
        if (n % d == 0) return false;
        return checkPrime(n, d - 1);
    }
}