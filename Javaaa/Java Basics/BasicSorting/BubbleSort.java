package BasicSorting;

import java.util.Arrays;

public class BubbleSort {
    public void bubbleSort(int[] arr) {
        int arrLength = arr.length;
        for (int i = 0; i < arrLength - 1; i++) {
            for (int j = 0; j < arrLength - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public int[] bubbleSortReturningNewArray(int[] arr) {
        int arrLength = arr.length;
        int[] result = Arrays.copyOfRange(arr, 0, arrLength);
        // int[] result = new int[arrLength];
        // for (int i = 0; i < arrLength; i++) {
        // result[i] = arr[i];
        // }
        for (int i = 0; i < arrLength - 1; i++) {
            for (int j = 0; j < arrLength - 1 - i; j++) {
                if (result[j] > result[j + 1]) {
                    swap(result, j, j + 1);
                }
            }
        }
        return result;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        BubbleSort solution = new BubbleSort();
        int[] arr = new int[] { 5, 4, 3, 2, 1, 10 };
        // solution.bubbleSort(arr);

        int[] result = solution.bubbleSortReturningNewArray(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(result));
    }
}