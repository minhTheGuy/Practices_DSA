import java.util.*;

public class MyStack<E> implements StackInterface<E> {
    private Node<E> top;
    private int num_nodes;
    MyStack() {
        top = null;
        num_nodes = 0;
    }

    public void push(E item) {
        top = new Node<E>(item, top);
        num_nodes++;
    }
    public E pop() throws NoSuchElementException{
        if (top == null) {
            throw new NoSuchElementException();
        }
        E tmp = top.getData();
        top = top.getNext();
        --num_nodes;
        return tmp;
    }
    public int size() {
        return num_nodes;
    }
    public boolean contains(E item) {
        Node<E> tmp = top;
        while (tmp != null) {
            if (tmp.getData().equals(item))
                return true;
            tmp = tmp.getNext();
        } 
        return false;
    }
    public void print() {
        Node<E> tmp = top;
        if (tmp == null) return;
        else System.out.print(tmp.getData());
        tmp = tmp.getNext();
        while (tmp != null) {
            System.out.print(" -> " + tmp.getData());
            tmp = tmp.getNext();
        }
        System.out.println();
    }
    public boolean isEmpty() {
        return num_nodes == 0;
    }
    public E getPeek() {
        if (top == null) {
            return null;
        }
        return top.getData();
    }

}