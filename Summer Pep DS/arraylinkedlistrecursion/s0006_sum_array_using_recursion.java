// Time Complexity: O(n)
// Space Complexity: O(n)
// sum array using recursion
public class s0006_sum_array_using_recursion {
    private int sumArrayRecursive(int[] arr, int index) {
        if (index == arr.length) {
            return 0;
        } else {
            return arr[index] + sumArrayRecursive(arr, index + 1);
        }
    }
}
