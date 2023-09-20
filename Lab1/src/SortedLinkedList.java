import java.util.NoSuchElementException;

public class SortedLinkedList {
    private Node<Integer> head;
    private int num_nodes;

    public SortedLinkedList() {
        this.head = null;
        this.num_nodes = 0;
    }

    public void add(Integer item) {
        if (head == null) {
            addFirst(item);
            ++num_nodes;             // head = null : 1 2 4 5
            return;                 // add 3 :
        }
        // 1 3 5 9
        Node<Integer> prev = null; // curr.getNext().getData() >= 3
        Node<Integer> curr = head;
        while (curr != null) {
            if (curr.getData() >= item) {
                addAfter(item, prev);
                ++num_nodes;
                return;
            }
            prev = curr;
            curr = curr.getNext();
        }
        addAfter(item, prev);
        ++num_nodes;
    }

    private void addFirst(Integer item) {
        head = new Node<Integer>(item, head);
        ++num_nodes;
    }

    private void addAfter(int item, Node<Integer> curr) {

        if (curr == null) {
            addFirst(item);
            ++num_nodes;
            return;
        }
        Node<Integer> newNode = new Node<Integer>(item, curr.getNext());
        curr.setNext(newNode);
        ++num_nodes;
    }

    public boolean remove(int element) {
        if (head == null) return false;
        Node<Integer> tmp = head;
        Node<Integer> prev = null;
        if (tmp.getData() == element) {
            head = tmp.getNext();
            --num_nodes;
            return true;
        }
        while (tmp != null) {
            if (tmp.getData() == element) {
                prev.setNext(tmp.getNext());
                --num_nodes;
                return true;
            }
            prev = tmp;
            tmp = tmp.getNext();
        }
        return false;
    }

    public void print() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        Node<Integer> curr = head;
        while (curr != null) {
            System.out.print(curr.getData() + " ");
            curr = curr.getNext();
        }
        System.out.println();
    }
}
