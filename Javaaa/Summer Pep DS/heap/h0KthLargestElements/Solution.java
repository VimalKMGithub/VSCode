package heap.h0KthLargestElements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {

    public int findKthLargest(int[] nums, int k) {
        // // Time Complexity: O(n log n)
        // // Space Complexity: O(log n)
        // Arrays.sort(nums);
        // int count = 0;
        // for (int i = nums.length - 1; i >= 0; i--) {
        // count++;
        // if (count == k) {
        // return nums[i];
        // }
        // }

        // Time Complexity: O(k log n)
        // Space Complexity: O(n)
        List<Integer> list = new ArrayList<>();
        for (int val : nums) {
            list.add(val);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(list);
        int count = 0;
        while (!pq.isEmpty()) {
            count++;
            if (count == k) {
                return pq.poll();
            } else {
                pq.poll();
            }
        }
        return Integer.MIN_VALUE;
    }
}