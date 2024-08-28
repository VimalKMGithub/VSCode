
// Time Complexity: O(n)
// Space Complexity: O(1)
// dutch national flag problem
import java.util.Arrays;

public class s0003_dutch_national_flag {
    public static void main(String[] args) {
        s0003_dutch_national_flag solution = new s0003_dutch_national_flag();
        int[] arr = { 2, 0, 2, 1, 1, 0, 2, 0, 1 };
        solution.sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

    private void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            switch (nums[mid]) {
                case 0:
                    swap(nums, low++, mid++);
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(nums, mid, high--);
                    break;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}