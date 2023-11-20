public class IntegerTriple {
    private Integer weight;
    private Integer source;
    private Integer destination;

    public IntegerTriple(Integer w, Integer s, Integer dst) { 
        weight = w;
        source = s;
        destination = dst;
    }

    public Integer getWeight() {
        return weight;
    }
    public Integer getSource() {
        return source;
    }
    public Integer getDestination() {
        return destination;
    }

    @Override
    public String toString() {
        return weight + " " + source + " " + destination;
    }
}