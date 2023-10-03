public class Ex1 {
    public static void main(String[] args) {
        int[] arr1 = {3, 5, 2, 8, -1};
        bubbleSort(arr1);
        for (int j : arr1) System.out.print(j + " ");
        System.out.println();
        int[] arr2 = { 3, 5, 2, 8, -1 };
        selectionSort(arr2);
        for (int j : arr2) System.out.print(j + " ");
        System.out.println();
        int[] arr3 = { 3, 5, 2, 8, -1 };
        insertionSort(arr3);
        for (int j : arr3) System.out.print(j + " ");
        System.out.println();
        int[] arr4 = {3, 5, 2, 8, -1};
        mergeSort(arr4, 0, arr4.length - 1);
        for (int j : arr4) System.out.print(j + " ");
        int[] arr5 = {3, 5, 2, 8, -1};
        quickSort(arr5, 0, arr5.length - 1);
        for (int i : arr4) System.out.print(i + " ");
        System.out.println((double) 8);
        int[] arr6 =  {3, 5, 2, 8, -1};
        System.out.println(countEven(arr6, arr6.length - 1));

    }
    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i]; arr[i] = arr[j]; arr[j] = tmp;
    }
    public static void mergeSort(int[] arr, int i, int j) {
        if (i < j) {
            int mid = (i + j) / 2;
            mergeSort(arr, i, mid);
            mergeSort(arr, mid + 1, j);
            merge(arr, i, mid, j);
        }
    }
    public static void merge(int[] arr, int i, int mid, int j) {
        int[] temp = new int[j - i + 1];
        int left = i; int right = mid + 1;
        int index = 0;
        while (left <= mid && right <= j)
            if (arr[left] < arr[right])
                temp[index++] = arr[left++];
            else
                temp[index++] = arr[right++];
        while (left <= mid)
            temp[index++] = arr[left++];
        while (right <= j)
            temp[index++] = arr[right++];
        for (int k = 0; k < temp.length; k++)
            arr[i + k] = temp[k];
    }
    public static void quickSort(int[] arr, int i, int j) {
        if (i < j) {
            int mypivot = parititon(arr, i, j);
            quickSort(arr, i, mypivot - 1);
            quickSort(arr, mypivot + 1, j);
        }
    }
    public static int parititon(int[] arr, int i, int j) {
        int pivot = arr[j];
        int marker = i - 1;
        int k;
        for (k = i; k <= j - 1; k++) {
            if (arr[k] < pivot) {
                ++marker;
                swap(arr, k, marker);
            }
        }
        swap(arr, j, marker + 1);
        return marker + 1;
    }
    public static int countEven(int[] arr, int index) {
        if (index < 0) return 0;
        if (arr[index] % 2 == 0) return 1 + countEven(arr, index - 1);
        return countEven(arr, index - 1);
    }
    public static void bubbleSort(int[] arr) { // sắp xếp nổi bọt
        for (int i = 1; i < arr.length; i++) // vòng for để duyệt từng phần tử của mảng
            for (int j = 0; j < arr.length - i; j++) // vòng for để kiểm tra phần tử 'j' có lớn hơn 'j+1' hay không
                if (arr[j] > arr[j+1])               // nếu có thì đổi chỗ cho nhau
                    swap(arr, j, j+1);            // (tức là ta sẽ cố găng đem giá trị lớn nhất về cuối mảng qua biến 'j')
    }
    public static void selectionSort(int[] arr) { // sắp xếp chọn
        for (int i = 0; i < arr.length; i++) // vòng for để duyệt từng phần tử của mảng
            for (int j = i + 1; j < arr.length; j++) { // vòng for để so sánh tất cả phần tử còn lại với phần tử 'i'
                if (arr[i] > arr[j])
                    swap(arr, i, j);
            }
    }
    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int next = arr[i]; // phần tử 'next' sẽ được insert vào vị trí bất kỳ trong mảng arr[0..i-1]
            int j; // biến đếm để tìm ra vị trí insert biến 'next'
            for (j = i - 1; j >= 0 && arr[j] > next; j--) //duyện từ (i-1) -> 0 để tìm vị trí insert
                arr[j+1] = arr[j];
            arr[j+1] = next; //insert 'next' vào vị trí tìm được
        }
    }
}
