// Time Complexity: O(n)
// Space Complexity: O(1)
// smallest subarray sum is k or greater
public class s0005_smallest_subarray_sum_is_k_or_greater {
    private int smallestSubarraySum(int[] arr, int targetSum) {
        int minLength = arr.length + 1;
        int sum = 0;
        int start = 0;
        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];
            while (sum >= targetSum && start <= end) {
                minLength = minLength < (end - start + 1) ? minLength : (end - start + 1);
                sum -= arr[start];
                start++;
            }
        }
        return minLength;
    }
}