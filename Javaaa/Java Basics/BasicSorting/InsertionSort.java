package BasicSorting;

import java.util.Arrays;

public class InsertionSort {
    public void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }

    public int[] insertionSortReturningNewArray(int[] arr) {
        int arrLength = arr.length;
        int[] result = Arrays.copyOfRange(arr, 0, arrLength);
        for (int i = 1; i < arrLength; i++) {
            int current = result[i];
            int j = i - 1;
            while (j >= 0 && result[j] > current) {
                result[j + 1] = result[j];
                j--;
            }
            result[j + 1] = current;
        }
        return result;
    }

    public static void main(String[] args) {
        InsertionSort solution = new InsertionSort();
        int[] arr = new int[] { 5, 4, 3, 2, 1, 10 };
        // solution.insertionSort(arr);

        int[] result = solution.insertionSortReturningNewArray(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(result));
    }
}