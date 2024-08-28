// Time Complexity: O(log n)
// Space Complexity: O(1)
// binary search
public class c0002_binary_search {
    public static void main(String[] args) {
        c0002_binary_search solution = new c0002_binary_search();
        int ans = solution.binarySearch(new int[] { 1, 2, 3, 4, 5 }, 4);
        System.out.println(ans);
    }

    private int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}