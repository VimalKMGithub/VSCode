// Time Complexity: O(n)
// Space Complexity: O(n)
// linear search using recursion
public class s0004_linear_search_using_recursion {
    private int linearSearch(int[] arr, int x, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == x) {
            return index;
        }
        return linearSearch(arr, x, index + 1);
    }
}