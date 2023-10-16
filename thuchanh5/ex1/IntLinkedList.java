
package ex1;
public class IntLinkedList {
    private Node head;

    public IntLinkedList() {

    }

    public void addFirst(int data) {
        head = new Node(data, head);
    }

    private boolean contains(int data) {
        if (head == null) return false;
        Node tmp = head;
        while (tmp != null) {
            if (tmp.getData() == data) return true;
            tmp = tmp.getNext();
        }
        return false;
    }

    public boolean addLast(int data) {
        if (head == null) {
            head = new Node(data, null);
            return true;
        }
        if (contains(data)) return false;
        Node tmp = head;
        while (tmp.getNext() != null) {
            tmp = tmp.getNext();
        }
        tmp.setNext(new Node(data, null));
        return true;
    }

    public boolean removeAt(int position) {
        if (head == null) return false;

        if (position < 1) return false;

        if (position == 1) {
            head = head.getNext();
            return true;
        }

        Node curr = head;
        Node prev = head;
        int length = 1;
        for (int i = 1; i < position && curr.getNext() != null; i++) {
            prev = curr;
            curr = curr.getNext();
            length++;
        }
        
        if (curr == null || position > length) return false;
        prev.setNext(curr.getNext());
        return true;
    }

    public int countOdd() {
        if (head == null) return 0;
        Node tmp = head;
        int total = 0;
        while (tmp != null) {
            if (tmp.getData() % 2 == 0) ++total;
            tmp = tmp.getNext();
        }
        return total;
    }

    public int searchKey(int key) {
        int idx = 1;
        if (head == null) return -1;
        Node tmp = head;
        while (tmp != null) {
            if (tmp.getData() == key) return idx;
            tmp = tmp.getNext();
        }
        return -1;
    }

    public boolean checkSorted() {
        boolean ascSorted = true;
        Node tmp = head;
        while (tmp.getNext() != null) {
            if (ascSorted) {
                if (tmp.getData() > tmp.getNext().getData());
                ascSorted = false;
            }
            else break;
        }
        boolean descSorted = true;
        tmp = head;
        while (tmp.getNext() != null) {
            if (descSorted) {
                if (tmp.getData() < tmp.getNext().getData());
                descSorted = false;
            }
            else break;
        }
        return ascSorted || descSorted;
    }
    

    public void printList() {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }
        Node tmp = head;
        while (tmp != null) {
            System.out.print(tmp.getData() + " ");
            tmp = tmp.getNext();
        }
        System.out.println();
    }
}