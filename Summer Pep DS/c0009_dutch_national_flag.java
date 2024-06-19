// Time Complexity: O(n)
// Space Complexity: O(1)
// dutch national flag problem
public class c0009_dutch_national_flag {
    private void sortColors(int[] nums) {
        int zeroPtr = -1;
        int twoPtr = nums.length;
        int itrPtr = 0;
        while (itrPtr < twoPtr) {
            if (nums[itrPtr] == 0) {
                zeroPtr++;
                swap(nums, zeroPtr, itrPtr);
                itrPtr++;
            } else if (nums[itrPtr] == 2) {
                twoPtr--;
                swap(nums, twoPtr, itrPtr);
            } else {
                itrPtr++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
