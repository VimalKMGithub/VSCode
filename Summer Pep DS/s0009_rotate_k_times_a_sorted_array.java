
// Time Complexity: O(n)
// Space Complexity: O(1)
// rotate the array k times
import java.util.Arrays;

public class s0009_rotate_k_times_a_sorted_array {
    public static void main(String[] args) {
        s0009_rotate_k_times_a_sorted_array solution = new s0009_rotate_k_times_a_sorted_array();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int rotation = 3;
        solution.rotate(arr, rotation);
        System.out.println(Arrays.toString(arr));
    }

    private void rotate(int[] arr, int rotation) {
        if (arr.length == 0) {
            return;
        }
        rotation = rotation % arr.length;
        reverseArray(arr, 0, rotation - 1);
        reverseArray(arr, rotation, arr.length - 1);
        reverseArray(arr, 0, arr.length - 1);
    }

    private void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
