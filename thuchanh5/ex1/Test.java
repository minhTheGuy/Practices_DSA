package ex1;
public class Test {
    public static void main(String[] args) {
        
        IntLinkedList list = new IntLinkedList();
        list.addFirst(8);
        list.addFirst(3);
        list.addFirst(1);
        list.addFirst(-2);

        System.out.println(list.addLast(20));
        System.out.println(list.addLast(9));
        System.out.println(list.addLast(11));

        list.printList();

        System.out.println(list.removeAt(0));
        System.out.println(list.removeAt(5));
        list.printList();
        System.out.println(list.removeAt(6));
        list.printList();
        System.out.println(list.removeAt(6));

    
        
        System.out.println(list.countOdd());

        System.out.println(list.searchKey(3));

        System.out.println(list.checkSorted());
        
    }
}