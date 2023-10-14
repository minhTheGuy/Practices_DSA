package ex3;

public class Ex1 {
    public static double prod_recur(int n) {
        if (n == 1) return 1;
        return n * prod_recur(n - 1);
    }

    public static int bin2dec(int n, int exp) {
        if (n == 0) return 0;
        return (int)Math.pow(2, exp) * (n % 10) + bin2dec(n / 10, exp + 1);
    }

    public static int maxDigit(int n) {
        if (n < 10) return n;
        return Math.max(n % 10, maxDigit(n / 10));
    }

    public static int maxElement(int[] arr, int n) {
        if (n == 0) return arr[0];
        return Math.max(arr[n], maxElement(arr, n - 1));
    }

    public static int search(int[] arr, int n, int key) {
        if (n < 0) return -1;
        return arr[n] == key ? arr[n] : search(arr, n - 1, key);
    }

    public static int findLastEvenPosition(int[] arr, int n) {
        if (n < 0) return -1;
        return arr[n] % 2 == 0 ? n : findLastEvenPosition(arr, n - 1);
    }
    public static void main(String[] args) {
        System.out.println(prod_recur(5));
        System.out.println(bin2dec(10, 0));
        System.out.println(maxDigit(1234));
        int[] arr = {8, 9, 3, 4, 1, 92, 83, 11, -5};
        System.out.println(maxElement(arr, arr.length - 1));
        System.out.println(search(arr, arr.length - 1, 11));
        System.out.println(findLastEvenPosition(arr, arr.length - 1));
    }
}
