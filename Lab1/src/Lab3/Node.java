package Lab3;
public class Node{
    private int item;
    private Node next;

    public Node(int item) {
        this.item = item;
        this.next = null;
    }

    public Node(int item, Node next) {
        this.item = item;
        this.next = next;
    }

    public int getData() {
        return this.item;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setData(int data) {
        this.item = data;
    }
}