package Lab3;

public class IntegerLinkedList {

    private Node head;
    private int size;

    public IntegerLinkedList() {
        this.head = null;
        this.size = 0;
    }
    public void setHead(Node head) {
        this.head = head;
    }
    public Node getHead() {
        return head;
    }
    public int countEven() {
        int count = 0;
        Node curr = head;
        while (curr != null) {
            if (curr.getData() % 2 == 0) {
                count++;
            }
            curr = curr.getNext();
        }
        return count;
    }

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        int i = 2;
        while (i <= Math.sqrt(n)) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

    public int countPrime() {
        int count = 0;
        Node curr = head;
        while (curr != null) {
            if (isPrime(curr.getData())) {
                count++;
            }
            curr = curr.getNext();
        }
        return count;
    }

    public int addFirstEven(int item) {
        Node tmp = head;
        while (tmp != null) {
            if (tmp.getData() % 2 == 0) {
                addAfter(item, tmp);
                return 1;
            }
            tmp = tmp.getNext();
        }
        return 0;
    }

    private void addAfter(int item, Node tmp) {
        if (tmp == null) return;
        Node newNode = new Node(item);
        Node curr = head;
        while (curr.getNext() != tmp)
            curr = curr.getNext();
        curr.setNext(newNode);
        newNode.setNext(tmp);
    }

    public boolean isEmpty() {
        return this.head == null;
    }
    public int findMax() {
        if (isEmpty()) {
            return -1;
        }
        int max = head.getData();
        Node curr = head;
        while (curr != null) {
            if (curr.getData() > max) {
                max = curr.getData();
            }
            curr = curr.getNext();
        }
        return max;
    }
    public void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.getData() + " ");
            curr = curr.getNext();
        }
        System.out.println();
    }
}