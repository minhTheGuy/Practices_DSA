import java.util.NoSuchElementException;

public interface DoubleListInterface {
    public void addFirst(Double item);
    public void addAfter(Double item, Node<Double> curr);
    public void addLast(Double item);
    public void removeFirst();
    public void removeAfter(Node<Double> curr);
    public void removeLast();
    public int size();
    public boolean contains(Double item);
    public void print();
    public boolean isDoublempty();
    public Node<Double> getHead();
    public Double getFirst();

    public void removeCurr(Node<Double> curr) throws NoSuchElementException;

}
