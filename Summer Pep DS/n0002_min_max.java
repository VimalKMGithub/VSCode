public class n0002_min_max {
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // max in an array
    private int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // min in an array
    private int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // 2nd max in an array
    private int secondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // 2nd min in an array
    private int secondMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }
        return secondMin;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // 3rd max in an array
    private int thirdMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                thirdMax = secondMax;
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                thirdMax = secondMax;
                secondMax = arr[i];
            } else if (arr[i] > thirdMax && arr[i] != secondMax && arr[i] != max) {
                thirdMax = arr[i];
            }
        }
        return thirdMax;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // 3rd min in an array
    private int thirdMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        int thirdMin = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                thirdMin = secondMin;
                secondMin = min;
                min = arr[i];
            } else if (arr[i] < secondMin && arr[i] != min) {
                thirdMin = secondMin;
                secondMin = arr[i];
            } else if (arr[i] < thirdMin && arr[i] != secondMin && arr[i] != min) {
                thirdMin = arr[i];
            }
        }
        return thirdMin;
    }
}
