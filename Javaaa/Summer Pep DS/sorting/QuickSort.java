package sorting;

public class QuickSort implements SortingAlgorithm {
    @Override
    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    // Time complexity: O(nlogn) in average case, O(n^2) in worst case
    // Space complexity: O(logn) in average case, O(n) in worst case
    // unstable
    public void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int boundary = partitionAndSetCorrectPositionForPivot(arr, start, end);
        quickSort(arr, start, boundary - 1);
        quickSort(arr, boundary + 1, end);
    }

    // Time complexity: O(n)
    // Space complexity: O(1)
    public int partitionAndSetCorrectPositionForPivot(int[] arr, int start, int end) {
        int pivotValue = arr[start];
        int boundary = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] > pivotValue) {
                continue;
            }
            boundary++;
            swap(arr, boundary, i);
        }
        swap(arr, start, boundary);
        return boundary;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}