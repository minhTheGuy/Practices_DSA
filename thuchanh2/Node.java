/**
 * @param <E> the type of elements in this node
 *           This class is used to create a node in a linked list
 *           Each node has an element and a pointer to the next node
 *           The element is of type E
 *           The next node is of type Node<E>
 *           The class has 2 constructors:
 *           Node(E data) and Node(E data, Node<E> next)
 *           The class has 3 methods:
 *           getData(), getNext(), setNext(Node<E> curr)
 *           The class has 2 attributes:
 *           element and next
 *           The element is of type E
 *           The next node is of type Node<E>
 */
class Node<E> {
    private E element;
    private Node<E> next;
    public Node(E data) {
        element = data;
        next = null;
    }
    public Node(E data, Node<E> next) {
        element = data;
        this.next = next;
    }

    public E getData() {
        return element;
    }
    public Node<E> getNext() {
        return next;
    }
    public void setNext(Node<E> curr) {
        next = curr;
    }
}