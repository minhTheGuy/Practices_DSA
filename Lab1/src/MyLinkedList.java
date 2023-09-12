public class MyLinkedList<E> implements ListInterface<E>{

    private Node<E> head;
    private int size;
    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

public void addFirst(E item) {
        Node<E> newNode = new Node<E>(item);
        newNode.setNext(this.head);
        this.head = newNode;
        this.size++;
    }

public void addAfter(E item, Node<E> curr) {
        Node<E> newNode = new Node<E>(item);
        newNode.setNext(curr.getNext());
        curr.setNext(newNode);
        this.size++;
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
        this.size++;
    }

public void removeFirst() {
        if (this.head != null) {
            this.head = this.head.getNext();
            this.size--;
        }
    }

public void removeAfter(Node<E> curr) {
        if (curr.getNext() != null) {
            curr.setNext(curr.getNext().getNext());
            this.size--;
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
            this.size--;
        }
    }

public int size() {
        return this.size;
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

}
