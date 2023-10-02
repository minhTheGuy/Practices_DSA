public class Ex6 {
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, -1, 8};
        System.out.println(minOfArray(arr));
        System.out.println(sumOfAllElement(arr));
        System.out.println(countEven(arr));

    }

    public static int minOfArray(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    public static int sumOfAllElement(int[] arr) {
        int sum = 0;
        for (int num : arr)
            sum += num;
        return sum;
    }

    public static int countEven(int[] arr) {
        int count = 0;
        for (int num : arr)
            if (num % 2 == 0)
                ++count;
        return count;
    }
}