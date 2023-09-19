public class StackReverseChar {
    public static void main(String[] args) {
        StackInterface<Character> stack = new MyStack<Character>();
        String s = "abc";
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        while (stack.getPeek() != null) {
            System.out.print(stack.pop());
        }
    }
}