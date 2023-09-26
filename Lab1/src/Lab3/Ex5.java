import java.util.Stack;

public class Ex5 {
    public static void main(String[] args) {
        System.out.println(decimalToBinary(52, 0));
    }

    public static double decimalToBinary(int n, int count) {
        if (n == 0) return 0;
        return (n % 2) * Math.pow(10, count) + decimalToBinary(n / 2, count + 1); 
    }
}