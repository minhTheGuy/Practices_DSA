public class StackCheckParenthese {
    public static MyStack<Character> stack = new MyStack<Character>();
    public static void main(String[] args) {

        String s = "((2+3)*4)";
        System.out.println(checkParenthese(s));
    }

    public static boolean checkParenthese(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            else if (c == ')' || c == ']' || c == '}') {
                if (stack.getPeek() == null) {
                    return false;
                }
                char tmp = stack.pop();
                if (c == ')' && tmp != '(') {
                    return false;
                }
                if (c == ']' && tmp != '[') {
                    return false;
                }
                if (c == '}' && tmp != '{') {
                    return false;
                }
            }
            else continue;
        }
        return true;
    }

}
