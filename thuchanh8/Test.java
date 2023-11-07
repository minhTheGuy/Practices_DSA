public class Test {
    public static void main(String[] args) {
        
        int[] arr = {15, 23, 18, 63, 21, 35, 36, 21, 66, 12, 42, 35, 75, 23, 64, 78, 39};
        maxHeapSort(arr);

        PriorityQueue q = new PriorityQueue(100);

        q.insert(new Person("Alex", 3));
        q.insert(new Person("Bob", 2));
        q.insert(new Person("David", 6));
        q.insert(new Person("Susan", 1));

        Person rs = q.extractMax();
        System.out.println(rs.toString());

        q.insert(new Person("Mike", 5));
        q.insert(new Person("Kevin", 4));

        rs = q.extractMax();
        System.out.println(rs.toString());
        rs = q.extractMax();
        System.out.println(rs.toString());

        q.insert(new Person("Helen", 0));
        q.insert(new Person("Paul", 8));
        q.insert(new Person("Iris", 7));

        rs = q.extractMax();
        System.out.println(rs.toString());
    }

    public static MaxHeap buildMaxHeap(int[] arr) {
        MaxHeap heap = new MaxHeap(100);
        for (int i = 0; i < arr.length; i++)
            heap.insert(arr[i]);
        return heap;
    }

    public static void maxHeapSort(int[] arr) {
        MaxHeap heap = buildMaxHeap(arr);
        for (int i = 0; i < arr.length; i++)
            arr[i] = heap.extractMax();
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static MinHeap buildMinHeap(int[] arr) {
        MinHeap heap = new MinHeap(100);
        for (int i = 0; i < arr.length; i++)
            heap.insert(arr[i]);
        return heap;
    }

    public static void minHeapSort(int[] arr) {
        MinHeap heap = buildMinHeap(arr);
        for (int i = 0; i < arr.length; i++)
            arr[i] = heap.extractMax();
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

}