import java.util.NoSuchElementException;

public class PriorityQueue {
    private Person[] heap;
    int heapSize;
    int maxSize;

    public PriorityQueue(int capcity) {
        heapSize = 0;
        maxSize = capcity;
        heap = new Person[maxSize + 1];
        heap[0] = null;
    }

    private int parent(int i) {
        return i/2;
    }

    private int left(int i) {
        return 2*i;
    }

    private int right(int i) {
        return 2*i + 1;
    }

    private void swap(int i, int j) {
        Person temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void insert(Person person) {
        ++heapSize;
        heap[heapSize] = person;
        shiftUp(heapSize);
    }
    
    private void shiftUp(int i) {
        while (i > 1 && heap[parent(i)].p_num < heap[i].p_num) {
            swap(parent(i), i);
            i = parent(i);
        }
    }

    public Person extractMax() {
        if (heapSize == 0)
            throw new NoSuchElementException("Underflow Exception");
        Person max = heap[1];
        heap[1] = heap[heapSize];
        --heapSize;
        shiftDown(1);
        return max;
    }

    private void shiftDown(int i) {
        while (i < heapSize) {
            Person max = heap[i];
            int maxId = i;
            if (left(i) <= heapSize && max.p_num < heap[left(i)].p_num) {
                max = heap[left(i)];
                maxId = left(i);
            }
            if (right(i) <= heapSize && max.p_num < heap[right(i)].p_num) {
                max = heap[right(i)];
                maxId = right(i);
            }
            if (maxId != i) {
                swap(i, maxId);
                i = maxId;
            }
            else
                break;
        }
    }
    
}