public class Fraction {
    private int numer;
    private int denom;
    public Fraction(int numer, int denom) {
        this.numer = numer;
        this.denom = denom;
    }
    public Fraction() {
        this.numer = 0;
        this.denom = 1;
    }
    public boolean equals(Fraction o) {
        if (this.numer * o.denom == this.denom * o.numer) 
           return true;

        return false;
    }
    public String toString() {
        return numer + "/" + denom;
    }
}