
// Time Complexity: O(n+k)
// Space Complexity: O(n-k+1)
// moving average of an array using sliding window
import java.util.Arrays;

public class c0008_moving_avg_sliding_window {
    public static void main(String[] args) {
        c0008_moving_avg_sliding_window solution = new c0008_moving_avg_sliding_window();
        int[] ans = solution.movingAverage(new int[] { 1, 2, 3, 4, 5 }, 3);
        System.out.println(Arrays.toString(ans));
    }

    private int[] movingAverage(int[] arr, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int[] res = new int[arr.length - k + 1];
        int start = 0;
        int end = k - 1;
        res[start] = sum / k;
        while (end + 1 < arr.length) {
            end++;
            sum += arr[end];
            sum -= arr[start];
            start++;
            res[start] = sum / k;
        }
        return res;
    }
}
