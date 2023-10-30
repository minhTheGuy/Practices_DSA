//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {

    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            System.out.println(
                new Solution().infixToPostfix(br.readLine().trim()));
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to convert an infix expression to a postfix expression.
    public static String infixToPostfix(String exp) {
        StringBuilder result = new StringBuilder();
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))
                result.append(c);
            else if (c == '(')
                stack.push(c);
            else if (c == ')') {
                while (!stack.isEmpty()) {
                    if (stack.peek() != '(')
                        result.append(stack.pop());
                }
                stack.pop();
            }
            else {
                while (!stack.isEmpty()) {
                    if (precedence(c) <= precedence(stack.peek()))
                        result.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while (!stack.isEmpty())
            result.append(stack.pop());
        return result.toString();
    }
    private static int precedence(char c) {
        switch (c) {
            case '+' : return 1;
            case '-' : return 1;
            case '*' : return 2;
            case '/' : return 2;
            case '^' : return 3;
            default : return 0;
        }
    }
}