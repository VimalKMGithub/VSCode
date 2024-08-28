// Time Complexity: O(n)
// Space Complexity: O(n)
// linear search using recursion
public class n0004_linear_search_using_recursion {
    private int linearSearch(int[] arr, int val, int arraySize) {
        if (arraySize == 0) {
            return -1;
        }
        if (arr[arraySize - 1] == val) {
            return arraySize - 1;
        }
        return linearSearch(arr, val, arraySize - 1);
    }
}
