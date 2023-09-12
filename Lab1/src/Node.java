public class Node<E> {
    private E item;
    private Node<E> next;

    public Node(E item) {
        this.item = item;
        this.next = null;
    }

    public Node(E item, Node<E> next) {
        this.item = item;
        this.next = next;
    }

    public E getData() {
        return this.item;
    }

    public Node<E> getNext() {
        return this.next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public void setData(E data) {
        this.item = data;
    }
}