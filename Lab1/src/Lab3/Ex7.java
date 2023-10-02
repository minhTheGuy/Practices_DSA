package Lab3;

public class Ex7 {
        public static void main(String[] args) {
            int[] arr = {3, 7, 2, -1, 8};
            System.out.println(minOfArray(arr, arr.length - 1));
            System.out.println(sumOfAllElement(arr, 0));
            System.out.println(countEven(arr, 0));
        }

        public static int minOfArray(int[] arr, int n) {

            if (n == 0) return arr[0];
            int result = minOfArray(arr, n - 1);
            return Math.min(result, arr[n]);
        }

        public static int sumOfAllElement(int[] arr, int index) {
            if (index == arr.length) return 0;
            return arr[index] + sumOfAllElement(arr, index + 1);
        }

        public static int countEven(int[] arr, int index) {
            if (index == arr.length) return 0;
            return (arr[index] % 2 == 0 ? 1 : 0) + countEven(arr, index + 1);
        }
}
