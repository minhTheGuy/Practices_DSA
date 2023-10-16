package ex2;
import java.util.Stack;
import java.util.*;

public class Ex1 {

    public static int precedence(char c) {
        return switch (c) {
            case '+' -> 1;
            case '-' -> 1;
            case '*' -> 2;
            case '/' -> 2;
            case '^' -> 3;
            default -> 0;
        };
    }

    public static void main(String[] args) {

        Stack<Character> stack = new Stack<Character>();
        String result = "";
        String s = "1+2*(8-3/2)";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9' || c == ' ') result += c;
            else if (c == '(') stack.push(c);
            else if (c == ')') {
                while(!stack.isEmpty()) {
                    if (stack.peek() == '(') {
                        stack.pop();
                        break;
                    }
                    result += stack.pop();
                }
            }
            else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result += stack.pop();
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        System.out.println(result);
    }

}
