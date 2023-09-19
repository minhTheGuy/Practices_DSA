public class TestMyQueue {
    public static void main(String[] args) {
        QueueInterface<Integer> queue = new MyQueue<Integer>();
        queue.enQueue(3);
        queue.enQueue(4);
        System.out.println(queue.contains(45));
    }
}