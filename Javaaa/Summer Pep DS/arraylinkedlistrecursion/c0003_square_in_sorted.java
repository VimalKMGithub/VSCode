
// Time Complexity: O(n)
// Space Complexity: O(n)
// write square of arrays elements in sorted order
import java.util.Arrays;

public class c0003_square_in_sorted {
    public static void main(String[] args) {
        c0003_square_in_sorted solution = new c0003_square_in_sorted();
        int[] ans = solution.sortedSquare(new int[] { -11, -10, 2, 4, 12, 13 });
        System.out.println(Arrays.toString(ans));
    }

    private int[] sortedSquare(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int[] result = new int[arr.length];
        int resultPtr = arr.length - 1;
        while (left <= right) {
            int leftSquare = square(arr[left]);
            int rightSquare = square(arr[right]);
            if (leftSquare > rightSquare) {
                result[resultPtr--] = leftSquare;
                left++;
            } else {
                result[resultPtr--] = rightSquare;
                right--;
            }
        }
        return result;
    }

    private int square(int val) {
        return val * val;
    }
}