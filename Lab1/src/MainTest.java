public class MainTest {
    public static void main(String[] args) {
        System.out.println("list1 :");
        SortedLinkedList list1 = new SortedLinkedList();
        list1.add(1);
        list1.add(3);
        list1.add(7);
        list1.print();
        list1.add(4);
        list1.print();

        System.out.println("list2 :");
        SortedLinkedList list2 = new SortedLinkedList();
        list2.add(4);
        list2.add(1);
        list2.add(7);
        list2.add(5);
        list2.add(2);
        list2.print();
        System.out.println(list2.remove(1));
        System.out.println(list2.remove(4));
        System.out.println(list2.remove(-5));
        System.out.println(list2.remove(7));
        System.out.println(list2.remove(2) + " " +list2.remove(5));
        list2.print();
    }
}
