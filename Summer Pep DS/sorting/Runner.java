package sorting;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        // SortingAlgorithm selectionSort = new SelectionSort();
        // SortingAlgorithm selectionSort = new InsertionSort();
        SortingAlgorithm selectionSort = new BubbleSort();
        int[] arr = { 6, 2, -1, 3, 9, -10, 9, 97 };
        selectionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
