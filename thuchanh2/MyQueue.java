public class MyQueue<E> implements QueueInterface<E> {
    private Node<E> front;
    private Node<E> rear;
    private int num_nodes;
    public MyQueue() {
        front = null;
        rear = null;
        num_nodes = 0;
    }

    public void enQueue(E item) {
        rear = new Node<E>(item, rear);
        ++num_nodes;
    }
    public E deQueue() {
        Node<E> tmp = rear;
        if (tmp == null) {
            return null;
        }
        if (tmp == front) {
            rear = null;
            front = null;
            return tmp.getData();
        }
        while (tmp.getNext() != front) {
            tmp = tmp.getNext();
        }
        
        tmp.setNext(null);
        front = tmp;
        --num_nodes;
        return tmp.getData();
    }
    public int size() {
        return num_nodes;
    }
    public void print() {
        if (front == null || rear == null){
            System.out.println("Queue is empty!");
            return;
        }
        
    }
    public boolean isEmpty() {
        return num_nodes == 0;
    }
    public E getFront() {
        return front.getData();
    }
    public boolean contains(E item) {
        Node<E> tmp = rear;
        while (tmp != null) {
            if (tmp.getData().equals(item))
                return true;
            tmp = tmp.getNext();
        }
        return false;
    }
}