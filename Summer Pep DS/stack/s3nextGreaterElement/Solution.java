package stack.s3nextGreaterElement;

import java.util.Arrays;
import java.util.Stack;

public class Solution {
    // Time: O(n), Space: O(n)
    public Integer[] nextGreaterElement(int[] arr) {
        Integer[] ans = new Integer[arr.length];
        int count = 2 * arr.length;
        Stack<Integer> decreasingStack = new Stack<>();
        int ptr = arr.length - 1;
        while (count > 0) {
            int val = arr[ptr];
            while (!decreasingStack.empty() && decreasingStack.peek() <= val) {
                decreasingStack.pop();
            }
            if (!decreasingStack.empty()) {
                ans[ptr] = decreasingStack.peek();
            }
            decreasingStack.push(val);
            ptr = ptr == 0 ? arr.length - 1 : ptr - 1;
            count--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 3, 8, 7, 1, 2, 1, 4, 2 };
        Integer[] ans = new Solution().nextGreaterElement(arr);
        System.out.println(Arrays.toString(ans));
    }
}