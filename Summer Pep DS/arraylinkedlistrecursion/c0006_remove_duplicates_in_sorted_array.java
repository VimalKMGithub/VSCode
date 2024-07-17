// Time Complexity: O(n)
// Space Complexity: O(1)
// given a sorted array remove all duplicates
public class c0006_remove_duplicates_in_sorted_array {
    public static void main(String[] args) {
        c0006_remove_duplicates_in_sorted_array solution = new c0006_remove_duplicates_in_sorted_array();
        int[] nums = new int[] { 1, 1, 2, 2, 3, 4, 4, 5, 5 };
        int length = solution.removeDuplicates(nums);
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    private int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i + 1;
    }
}