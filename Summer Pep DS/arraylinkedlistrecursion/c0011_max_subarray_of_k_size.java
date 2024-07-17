// Time Complexity: O(n)
// Space Complexity: O(1)
// max subarray of k size
public class c0011_max_subarray_of_k_size {
    private static class Answer {
        int maxSum;
        int start;
        int end;

        private Answer(int maxSum, int start, int end) {
            this.maxSum = maxSum;
            this.start = start;
            this.end = end;
        }
    }

    private Answer maxWindowSum(int[] arr, int k) {
        if (k > arr.length) {
            throw new IllegalArgumentException("Not Possible");
        }
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int maxSum = sum;
        int start = 0;
        int end = k - 1;
        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i] - arr[i - k];
            if (sum > maxSum) {
                maxSum = sum;
                start = i - k + 1;
                end = i;
            }
        }
        return new Answer(maxSum, start, end);
    }
}