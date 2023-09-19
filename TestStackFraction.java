public class TestStackFraction {
    public static void main(String[] args) {
        StackInterface<Fraction> stack = new MyStack<Fraction>();
        stack.push(new Fraction(1, 2));
        stack.push(new Fraction(2, 4));
        stack.print();
        Fraction tmp = stack.pop();
        System.out.println(tmp.equals(stack.getPeek()));
    }
}