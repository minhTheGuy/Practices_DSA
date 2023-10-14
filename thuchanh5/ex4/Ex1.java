package ex4;

public class Ex1 {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
    }

    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j-1] > arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int insert = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[i] < arr[j]; j--)
                arr[j + 1] = arr[j];
            arr[++j] = insert;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4};
        bubbleSort(arr);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

}
