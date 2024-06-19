// Time Complexity: O(n)
// Space Complexity: O(n)
// array sum using recursion
public class c0012_sum_array_recursive {
    private int arraySumRecursive(int[] arr, int arrSize) {
        if (arrSize == 0) {
            return 0;
        }
        return arraySumRecursive(arr, arrSize - 1) + arr[arrSize - 1];
    }
}
