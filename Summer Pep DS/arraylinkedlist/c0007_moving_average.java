
// Time Complexity: O(n*k)
// Space Complexity: O(n-k+1)
// moving average of an array
import java.util.Arrays;

public class c0007_moving_average {
    public static void main(String[] args) {
        c0007_moving_average solution = new c0007_moving_average();
        int[] ans = solution.movingAverage(new int[] { 1, 2, 3, 4, 5 }, 3);
        System.out.println(Arrays.toString(ans));
    }

    private int[] movingAverage(int[] arr, int k) {
        int[] result = new int[arr.length - k + 1];
        for (int i = 0; i < arr.length - k + 1; i++) {
            int sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            result[i] = sum / k;
        }
        return result;
    }
}
