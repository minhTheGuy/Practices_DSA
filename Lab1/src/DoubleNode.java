public class DoubleNode {
    private double item;
    private DoubleNode next;

    public DoubleNode(double item) {
        this.item = item;
        this.next = null;
    }

    public DoubleNode(double item, DoubleNode next) {
        this.item = item;
        this.next = next;
    }

    public double getData() {
        return this.item;
    }

    public DoubleNode getNext() {
        return this.next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public void setData(double data) {
        this.item = data;
    }
}
