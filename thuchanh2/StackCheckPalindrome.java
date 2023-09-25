public class StackCheckPalindrome {
    public static void main(String[] args) {
        String s = "aba";
        System.out.println(checkPalindrome(s));
    }
    public static boolean checkPalindrome(String s) {
        MyQueue<Character> head = new MyQueue<Character>();
        MyStack<Character> tail = new MyStack<Character>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            head.enQueue(c);
            tail.push(c);
        }
        while (!head.isEmpty() && !tail.isEmpty()) {
            if (!head.deQueue().equals(tail.pop())) return false;
        }
        return head.isEmpty() && tail.isEmpty();
    }
}
// abcba
// stack : a <- b <- c <- d
// queue : a -> b -> c -> d
