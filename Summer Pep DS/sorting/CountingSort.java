package sorting;

public class CountingSort implements SortingAlgorithm {
    // N is size of original array
    // M is the max element in the original array
    // Time complexity: O(N + M)
    // Space complexity: O(max(M, N)) or O(M + N)
    // stable
    @Override
    public void sort(int[] arr) {
        // Time complexity: O(N)
        // Space complexity: O(1)
        int max = max(arr);

        // Time complexity: O(N)
        // Space complexity: O(M)
        int[] countArray = countOccurrencesOfAllElements(arr, max);

        // int[] sortedArray = countToSortedArray(arr, countArray);

        // Time complexity: O(N + M)
        // Space complexity: O(N)
        int[] sortedArray = countToSortedArrayUsingCumulativeSum(arr, countArray);

        // Time complexity: O(N)
        // Space complexity: O(1)
        copyArray(sortedArray, arr);
    }

    // Time complexity: O(N)
    // Space complexity: O(M)
    private int[] countOccurrencesOfAllElements(int[] arr, int maxVal) {
        int[] countArray = new int[maxVal + 1];
        for (int i = 0; i < arr.length; i++) {
            countArray[arr[i]]++;
        }
        return countArray;
    }

    // Time complexity: O(N)
    // Space complexity: O(1)
    private void copyArray(int[] source, int[] dest) {
        for (int i = 0; i < source.length; i++) {
            dest[i] = source[i];
        }
    }

    public int[] countToSortedArray(int[] arr, int[] countArray) {
        int[] sortedArray = new int[arr.length];
        int index = 0;
        for (int i = 0; i < countArray.length; i++) {
            for (int j = 0; j < countArray[i]; j++) {
                sortedArray[index++] = i;
            }
        }
        return sortedArray;
    }

    // Time complexity: O(N + M)
    // Space complexity: O(N)
    public int[] countToSortedArrayUsingCumulativeSum(int[] arr, int[] countArray) {
        int[] sortedArray = new int[arr.length];
        // Time complexity: O(M)
        inPlaceCumulativeSum(countArray);
        // Time complexity: O(N)
        for (int i = arr.length - 1; i >= 0; i--) {
            int positionOfElement = countArray[arr[i]];
            sortedArray[positionOfElement - 1] = arr[i];
            countArray[arr[i]]--;
        }
        return sortedArray;
    }

    // Time complexity: O(N)
    // Space complexity: O(1)
    private int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    // Time complexity: O(M)
    // Space complexity: O(1)
    private void inPlaceCumulativeSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            arr[i] = sum;
        }
    }
}