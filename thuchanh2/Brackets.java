public class Brackets {
    static StackInterface<Character> stack = new MyStack<Character>();
    public static void main(String[] args) {
        
        String s = "(){}[]";
        System.out.println(checkBrackets(s));
        
    }
    public static boolean checkBrackets(String s) {

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(')
                stack.push(c);
            else if (c == '}' || c == ']' || c == ')') {
                if (stack.getPeek() == c){
                    stack.pop();
                }
                else {
                    return false;
                }
            }
            else continue;
        }
        if (stack.isEmpty()) return false;
        return true;
    }
}