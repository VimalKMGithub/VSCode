public class s0016_index_first_last_occurence {
    // Time complexity: O(log n)
    // Space complexity: O(1)
    // Find the first and last occurrence of a number in a sorted array
    private int[] firstLastOccurrenceInSortedArray(int[] arr, int target) {
        return new int[] { findFirstOccurrence(arr, target), findLastOccurrence(arr, target) };
    }

    private int findFirstOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    private int findLastOccurrence(int[] arr, int target) {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
}
