public class FractionEx {

    public static class Fraction {
        private int numerator = 0;
        private int denominator = 1;

        public Fraction(int numerator, int denominator) {
            this.numerator = numerator;
            this.denominator = denominator;
        }

        public String toString() {
            return this.numerator + "/" + this.denominator;
        }
        private void simplify() {
            int gcd = gcd(this.numerator, this.denominator);
            this.numerator /= gcd;
            this.denominator /= gcd;
        }

        private int gcd(int numerator, int denominator) {
            if (denominator == 0) {
                return numerator;
            }
            return gcd(denominator, numerator % denominator);
        }

        public boolean equals(Object o) {
            if (o instanceof Fraction) {
                Fraction f = (Fraction) o;
                if (this.numerator * f.denominator == this.denominator * f.numerator) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        MyLinkedList<Fraction> list = new MyLinkedList<Fraction>();
        list.addFirst(new Fraction(1, 2));
        list.addFirst(new Fraction(1, 3));
        list.addFirst(new Fraction(1, 4));
        list.addFirst(new Fraction(1, 5));
        list.addFirst(new Fraction(1, 6));
        list.addFirst(new Fraction(1, 7));
        list.print();
    }
}
