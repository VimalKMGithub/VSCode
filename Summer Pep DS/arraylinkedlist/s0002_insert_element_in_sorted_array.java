
// Time Complexity: O(n)
// Space Complexity: O(n)
// insert element in sorted array so that array remains sorted
import java.util.Arrays;

public class s0002_insert_element_in_sorted_array {
    public static void main(String[] args) {
        s0002_insert_element_in_sorted_array solution = new s0002_insert_element_in_sorted_array();
        int[] result = solution.insertElementInSortedArray(new int[] { 1, 2, 3, 4, 5 }, 6);
        System.out.println(Arrays.toString(result));
    }

    private int[] insertElementInSortedArray(int[] arr, int element) {
        int[] res = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        int i = res.length - 2;
        while (i >= 0 && res[i] > element) {
            res[i + 1] = res[i];
            i--;
        }
        res[i + 1] = element;
        return res;
    }
}