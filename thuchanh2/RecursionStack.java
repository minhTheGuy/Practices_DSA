
public class RecursionStack {
    public static void main(String[] args) {
        StackInterface<Double> stack = new MyStack<Double>();
        int num = 5;
        while (num > 1) {
            stack.push(function(num));
            --num;
        }
        stack.push(3.0);
        double result = 0;
        while (stack.getPeek() != null) {
            result = stack.pop();            
        }
        System.out.println(result);
    }
    public static double function(int num) {
        return Math.pow(2, num) + num * num;
    }
}



// P(N) = 2^n + n^2 + P(N-1) 