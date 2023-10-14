package ex3;
import java.util.*;
public class Ex3 {
    public static boolean checkPalindrome(int n) {
        Stack<Integer> stack = new Stack<Integer>();
        Queue<Integer> queue = new LinkedList<>();
        int tmp = n;
        while (tmp > 0) {
            stack.push(tmp % 10);
            queue.add(tmp % 10);
            tmp /= 10;
        }
        while (!stack.isEmpty()) {
            if (stack.pop() != queue.remove()) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 12321;
        if (checkPalindrome(n)) System.out.println("Palindrome");
        else System.out.println("Not palindrome");
    }
}
