package BasicSorting;

import java.util.Arrays;

public class SelectionSort {
    public void selectionSort(int[] arr) {
        int arrLength = arr.length;
        for (int i = 0; i < arrLength; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arrLength; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }

    public int[] selectionSortReturningNewArray(int[] arr) {
        int arrLength = arr.length;
        int[] result = Arrays.copyOfRange(arr, 0, arrLength);
        for (int i = 0; i < arrLength; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arrLength; j++) {
                if (result[j] < result[minIndex]) {
                    minIndex = j;
                }
            }
            swap(result, i, minIndex);
        }
        return result;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        SelectionSort solution = new SelectionSort();
        int[] arr = new int[] { 5, 4, 3, 2, 1, 10 };
        // solution.selectionSort(arr);

        int[] result = solution.selectionSortReturningNewArray(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(result));
    }
}