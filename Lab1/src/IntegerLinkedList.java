public class IntegerLinkedList extends MyLinkedList<Integer> {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.addFirst(6);
        list.print();
    }

    public static int countEven(MyLinkedList<Integer> list) {
        int count = 0;
        Node<Integer> curr = list.getHead();
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

    public static int countPrime(MyLinkedList<Integer> list) {
        int count = 0;
        Node<Integer> curr = list.getHead();
        while (curr != null) {
            if (isPrime(curr.getData())) {
                count++;
            }
            curr = curr.getNext();
        }
        return count;
    }

    public static int addFirstEven(MyLinkedList<Integer> list, int item) {
        Node<Integer> tmp = list.getHead();
        while (tmp != null) {
            if (tmp.getData() % 2 == 0) {
                list.addAfter(item, tmp);
                return 1;
            }
            tmp = tmp.getNext();
        }
        return 0;
    }

    public static int findMax(MyLinkedList<Integer> list) {
        if (list.isEmpty()) {
            return -1;
        }
        int max = list.getFirst();
        Node<Integer> curr = list.getHead();
        while (curr != null) {
            if (curr.getData() > max) {
                max = curr.getData();
            }
            curr = curr.getNext();
        }
        return max;
    }

    public static void reverseList(MyLinkedList<Integer> list) {
        Node<Integer> curr = list.getHead();
        Node<Integer> prev = null;
        Node<Integer> next = null;
        while (curr != null) {
            next = curr.getNext();
            curr.setNext(prev);
            prev = curr;
            curr = next;
        }
        list.setHead(prev);
    }

    public static void sortLinkedList(MyLinkedList<Integer> list) {
        Node<Integer> curr = list.getHead();
        Node<Integer> index = null;
        int tmp;
        while (curr != null) {
            index = curr.getNext();
            while (index != null) {
                if (curr.getData() > index.getData()) {
                    tmp = curr.getData();
                    curr.setData(index.getData());
                    index.setData(tmp);
                }
                index = index.getNext();
            }
            curr = curr.getNext();
        }
    }
}
