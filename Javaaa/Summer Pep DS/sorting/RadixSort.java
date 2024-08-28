package sorting;

public class RadixSort implements SortingAlgorithm {
    // Time Complexity: O(N*log K base 10)
    // Space Complexity: O(N)
    // stable
    @Override
    public void sort(int[] arr) {
        int maxDigitCount = getMaxDigitCount(arr);
        int place = 1;
        for (int i = 0; i < maxDigitCount; i++) {
            sortDigit(arr, place);
            place *= 10;
        }
    }

    private void sortDigit(int[] arr, int place) {
        int[] count = new int[10];
        for (int val : arr) {
            int digitAtGivenPlace = getDigitAtPlace(val, place);
            count[digitAtGivenPlace]++;
        }
        inPlaceCumulativeSum(count);
        int[] sortedArray = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            int digitAtGivenPlace = getDigitAtPlace(arr[i], place);
            int positionOfElement = count[digitAtGivenPlace];
            sortedArray[positionOfElement - 1] = arr[i];
            count[digitAtGivenPlace]--;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sortedArray[i];
        }
    }

    private int getDigitAtPlace(int val, int place) {
        return (val / place) % 10;
    }

    private void inPlaceCumulativeSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            arr[i] = sum;
        }
    }

    private int getMaxDigitCount(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int val : arr) {
            if (val > max) {
                max = val;
            }
        }
        return getDigitCount(max);
    }

    private int getDigitCount(int num) {
        int count = 0;
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}