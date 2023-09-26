import java.util.NoSuchElementException;

public class MyLinkedList<E> implements ListInterface<E>{

    private Node<E> head;
    private int num_nodes;
    public MyLinkedList() {
        this.head = null;
        this.num_nodes = 0;
    }

public void addFirst(E item) {
        Node<E> newNode = new Node<E>(item);
        newNode.setNext(this.head);
        this.head = newNode;
        this.num_nodes++;
    }

public void addAfter(E item, Node<E> curr) {
        Node<E> newNode = new Node<E>(item);
        newNode.setNext(curr.getNext());
        curr.setNext(newNode);
        this.num_nodes++;
    }

public void addLast(E item) {
        Node<E> newNode = new Node<E>(item);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node<E> curr = this.head;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(newNode);
        }
        this.num_nodes++;
    }

public void removeFirst() {
        if (this.head != null) {
            this.head = this.head.getNext();
            this.num_nodes--;
        }
    }

public void removeAfter(Node<E> curr) {
        if (curr.getNext() != null) {
            curr.setNext(curr.getNext().getNext());
            this.num_nodes--;
        }
    }

public void removeLast() {
        if (this.head != null) {
            if (this.head.getNext() == null) {
                this.head = null;
            } else {
                Node<E> curr = this.head;
                while (curr.getNext().getNext() != null) {
                    curr = curr.getNext();
                }
                curr.setNext(null);
            }
            this.num_nodes--;
        }
    }

public int size() {
        return this.num_nodes;
    }

public boolean contains(E item) {
        Node<E> curr = this.head;
        while (curr != null) {
            if (curr.getData().equals(item)) {
                return true;
            }
            curr = curr.getNext();
        }
        return false;
    }

public void print() {
        Node<E> curr = this.head;
        while (curr != null) {
            System.out.print(curr.getData() + " ");
            curr = curr.getNext();
        }
        System.out.println();
    }

public boolean isEmpty() {
        return this.head == null;
    }

public Node<E> getHead() {
        return this.head;
    }

public E getFirst() {
        return this.head.getData();
    }

    public void removeCurr(Node<E> curr) throws NoSuchElementException {
        if (curr == null) {
            throw new NoSuchElementException();
        }
        if (curr == head) {
            this.removeFirst();
        } else {
            Node<E> prev = this.head;
            while (prev.getNext() != curr) {
                prev = prev.getNext();
            }
            prev.setNext(curr.getNext());
            this.num_nodes--;
        }
    }

    public void setHead(Node<E> head) {
        this.head = head;
    }

    private Node<E> biggerNode(Node<E> head, E item) {
        if ((Integer) head.getData() > (Integer) item) return head;
        return biggerNode(head.getNext(), item);
    }

    public void addSortedLList(E item) {
        Node<E> tmp = this.head;
        if (tmp == null) {
            addFirst(item);
            return;
        }
        Node<E> prev = null;
        while (tmp != null && tmp != biggerNode(this.head, item)) {
            prev = tmp;
            tmp = tmp.getNext();
        }
        Node<E> newNode = new Node<E>(item, tmp);
        prev.setNext(newNode);
    }

}