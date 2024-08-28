package sorting;

public class MergeSort implements SortingAlgorithm {
    @Override
    public void sort(int[] arr) {
        int[] sortedArray = mergeSort(arr, 0, arr.length - 1);
        copyArray(sortedArray, arr);
    }

    // Time complexity: O(N * log(N))
    // Space complexity: O(N)
    // stable
    public int[] mergeSort(int[] arr, int start, int end) {
        if (start > end) {
            return new int[] {};
        } else if (start == end) {
            return new int[] { arr[start] };
        }
        int mid = start + (end - start) / 2;
        int[] sortedFirstHalf = mergeSort(arr, start, mid);
        int[] sortedSecondHalf = mergeSort(arr, mid + 1, end);
        return mergeSortedArray(sortedFirstHalf, sortedSecondHalf);
    }

    // assume N is the length of arr1 and M is the length of arr2
    // Time complexity: O(N + M)
    // Space complexity: O(N + M)
    public int[] mergeSortedArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }
        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }
        return result;
    }

    private void copyArray(int[] source, int[] dest) {
        for (int i = 0; i < source.length; i++) {
            dest[i] = source[i];
        }
    }
}
