package ex2;

import java.util.Stack;

public class Ex4 {
    public static String reverseWord(String s) {
        String result = "";
        String[] tmp = s.split(" ");
        Stack<String> stack = new Stack<String>();
        for (int i = 0; i < tmp.length; i++) {
            stack.push(tmp[i]);
        }
        while (!stack.isEmpty()) {
            result += stack.pop() + " ";
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "Hello world";
        System.out.println(reverseWord(s));
    }
}