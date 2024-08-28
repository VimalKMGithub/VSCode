package sorting;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        // SortingAlgorithm solution = new SelectionSort();
        // SortingAlgorithm solution = new InsertionSort();
        // SortingAlgorithm solution = new BubbleSort();
        // int[] arr = { 6, 2, -1, 3, 9, -10, 9, 97 };

        // SortingAlgorithm solution = new CountingSort();
        // int[] arr = { 6, 1, 7, 7, 1, 1, 7, 100, 2, 200 };

        // SortingAlgorithm solution = new MergeSort();
        // SortingAlgorithm solution = new QuickSort();
        // int[] arr = { 6, 2, -1, 3, 9, -10, 9, 97 };

        SortingAlgorithm solution = new RadixSort();
        int[] arr = { 121, 432, 564, 23, 1, 45, 788 };
        solution.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
