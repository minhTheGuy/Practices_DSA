import Lab3.IntegerLinkedList;
import Lab3.Node;

public class Ex8 {
    public static void main(String[] args) {
        IntegerLinkedList llist = new IntegerLinkedList();
        llist.setHead(addSortedLList(1, llist.getHead()));
        llist.setHead(addSortedLList(5, llist.getHead()));
        llist.setHead(addSortedLList(3, llist.getHead()));
        llist.setHead(addSortedLList(7, llist.getHead()));
        llist.setHead(addSortedLList(2, llist.getHead()));
        llist.print();
    }
    public static Node addSortedLList(int item, Node head) {
        if (head == null || item < head.getData()) {
            head = new Node(item, head);
            return head;
        }
        head.setNext(addSortedLList(item, head.getNext()));
        return head;
    }

}