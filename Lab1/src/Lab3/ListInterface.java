import java.util.NoSuchElementException;

public interface ListInterface<E> {
    public void addFirst(E item);
    public void addAfter(E item, Node<E> curr);
    public void addLast(E item);
    public void removeFirst();
    public void removeAfter(Node<E> curr);
    public void removeLast();
    public int size();
    public boolean contains(E item);
    public void print();
    public boolean isEmpty();
    public Node<E> getHead();
    public E getFirst();

    public void removeCurr(Node<E> curr) throws NoSuchElementException;
}