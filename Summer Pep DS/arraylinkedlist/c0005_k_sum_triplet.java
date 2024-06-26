
// Time Complexity: O(n^2)
// Space Complexity: O(1)
// given a sorted array containing distinct elements find triplet whose sum is equal to given target
import java.util.Arrays;

public class c0005_k_sum_triplet {
    public static void main(String[] args) {
        c0005_k_sum_triplet solution = new c0005_k_sum_triplet();
        int[] ans = solution.kSumTriplet(new int[] { 1, 2, 4, 5, 12, 19 }, 19);
        System.out.println(Arrays.toString(ans));
    }

    private int[] kSumTriplet(int[] arr, int target) {
        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                int currentSum = arr[i] + arr[left] + arr[right];
                if (currentSum == target) {
                    return new int[] { arr[i], arr[left], arr[right] };
                } else if (currentSum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return new int[] { -1, -1, -1 };
    }
}