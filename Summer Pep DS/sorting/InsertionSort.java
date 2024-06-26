package sorting;

public class InsertionSort implements SortingAlgorithm {
    // Time complexity: O(n^2)
    // Space complexity: O(1)
    // stable (Given that we don't cross same elements while inserting)
    @Override
    public void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            insertElementInSortedArray(arr, i, arr[i]);
        }
    }

    private void insertElementInSortedArray(int[] arr, int length, int valToInsert) {
        int i = length - 1;
        while (i >= 0 && arr[i] > valToInsert) {
            arr[i + 1] = arr[i];
            i--;
        }
        arr[i + 1] = valToInsert;
    }
}
