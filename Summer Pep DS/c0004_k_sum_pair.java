
// Time Complexity: O(n)
// Space Complexity: O(1)
// given a sorted array containing distinct elements find pair whose sum is equal to given target
import java.util.Arrays;

public class c0004_k_sum_pair {
    public static void main(String[] args) {
        c0004_k_sum_pair solution = new c0004_k_sum_pair();
        int[] ans = solution.kSumPair(new int[] { 2, 5, 8, 12, 30 }, 17);
        System.out.println(Arrays.toString(ans));
    }

    private int[] kSumPair(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int currentSum = arr[left] + arr[right];
            if (currentSum == target) {
                return new int[] { arr[left], arr[right] };
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[] { -1, -1 };
    }
}