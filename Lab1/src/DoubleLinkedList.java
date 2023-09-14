import java.util.*;
public class DoubleLinkedList implements DoubleListInterface {

    private Node<Double> head;
    private int num_nodes;

    public DoubleLinkedList() {
        this.head = null;
        this.num_nodes = 0;
    }
    @Override
    public void addFirst(Double item) {
        Node<Double> newNode = new Node<Double>(item);
        newNode.setNext(this.head);
        this.head = newNode;
        this.num_nodes++;
    }

    @Override
    public void addAfter(Double item, Node<Double> curr) {
        Node<Double> newNode = new Node<Double>(item);
        newNode.setNext(curr.getNext());
        curr.setNext(newNode);
        this.num_nodes++;
    }

    @Override
    public void addLast(Double item) {
        Node<Double> newNode = new Node<Double>(item);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node<Double> curr = this.head;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(newNode);
        }
        this.num_nodes++;
    }

    @Override
    public void removeFirst() {
        if (this.head != null) {
            this.head = this.head.getNext();
            this.num_nodes--;
        }
    }

    @Override
    public void removeAfter(Node<Double> curr) {
        if (curr.getNext() != null) {
            curr.setNext(curr.getNext().getNext());
            this.num_nodes--;
        }
    }

    @Override
    public void removeLast() {
        if (this.head != null) {
            if (this.head.getNext() == null) {
                this.head = null;
            } else {
                Node<Double> curr = this.head;
                while (curr.getNext().getNext() != null) {
                    curr = curr.getNext();
                }
                curr.setNext(null);
            }
            this.num_nodes--;
        }
    }

    @Override
    public int size() {
        return this.num_nodes;
    }

    @Override
    public boolean contains(Double item) {
        Node<Double> curr = this.head;
        while (curr != null) {
            if (curr.getData().equals(item)) {
                return true;
            }
            curr = curr.getNext();
        }
        return false;
    }

    @Override
    public void print() {
        Node<Double> curr = this.head;
        while (curr != null) {
            System.out.print(curr.getData() + " ");
            curr = curr.getNext();
        }
        System.out.println();
    }

    @Override
    public boolean isDoublempty() {
        return num_nodes == 0;
    }

    @Override
    public Node<Double> getHead() {
        return this.head;
    }

    @Override
    public Double getFirst() {
        return this.head.getData();
    }

    @Override
    public void removeCurr(Node<Double> curr) throws NoSuchElementException {
        if (curr == null) {
            throw new NoSuchElementException();
        } else if (curr == this.head) {
            this.removeFirst();
        } else {
            Node<Double> prev = this.head;
            while (prev.getNext() != curr) {
                prev = prev.getNext();
            }
            prev.setNext(curr.getNext());
            this.num_nodes--;
        }
    }
}