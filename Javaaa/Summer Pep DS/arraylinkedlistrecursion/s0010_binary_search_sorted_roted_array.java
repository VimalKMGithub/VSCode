// Time Complexity: O(log n)
// Space Complexity: O(1)
// binary search in sorted rotated array
public class s0010_binary_search_sorted_roted_array {
    public static void main(String[] args) {
        s0010_binary_search_sorted_roted_array solution = new s0010_binary_search_sorted_roted_array();
        int index = solution.search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0);
        System.out.println(index);
    }

    private int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[low] <= nums[mid]) {
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}