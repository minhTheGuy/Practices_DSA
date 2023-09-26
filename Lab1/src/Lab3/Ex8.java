public class Ex8 {
    public static void main(String[] args) {
        MyLinkedList<Integer> llist = new MyLinkedList<Integer>();
        llist.addSortedLList(3);
        llist.addSortedLList(5);
        llist.addSortedLList(-2);
        llist.print();
    }

}