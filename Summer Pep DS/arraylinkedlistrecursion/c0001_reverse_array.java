
// Time Complexity: O(n)
// Space Complexity: O(1)
// reverse an array
import java.util.Arrays;

public class c0001_reverse_array {
    public static void main(String[] args) {
        c0001_reverse_array solution = new c0001_reverse_array();
        int[] ans = solution.reverseArray(new int[] { 1, 2, 3, 4 });
        System.out.println(Arrays.toString(ans));
    }

    private int[] reverseArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
        return arr;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}