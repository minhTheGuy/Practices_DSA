import java.util.NoSuchElementException;

public class MaxHeap {
    private int[] heap;
    int heapSize;
    int maxSize;

    public MaxHeap(int capcity) {
        heapSize = 0;
        maxSize = capcity;
        heap = new int[maxSize + 1];
        heap[0] = -1;
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
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public void insert(int value) {
        ++heapSize;
        heap[heapSize] = value;
        shiftUp(heapSize);
    }
    
    private void shiftUp(int i) {
        while (i > 1 && heap[parent(i)] < heap[i]) {
            swap(parent(i), i);
            i = parent(i);
        }
    }

    public int extractMax() {
        if (heapSize == 0)
            throw new NoSuchElementException("Underflow Exception");
        int max = heap[1];
        heap[1] = heap[heapSize];
        --heapSize;
        shiftDown(1);
        return max;
    }

    private void shiftDown(int i) {
        while (i < heapSize) {
            int max = heap[i];
            int maxId = i;
            if (left(i) <= heapSize && max < heap[left(i)]) {
                max = heap[left(i)];
                maxId = left(i);
            }
            if (right(i) <= heapSize && max < heap[right(i)]) {
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