package a01PushAtBottomOfStack;

import java.util.Stack;

public class Solution {
    public void insertValueAtBottom(Stack<Integer> stack, Integer val) {
        if (stack.isEmpty()) {
            stack.push(val);
            return;
        }
        Integer poppedVal = stack.pop();
        insertValueAtBottom(stack, val);
        stack.push(poppedVal);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack);
        Solution sol = new Solution();
        sol.insertValueAtBottom(stack, 5);
        System.out.println(stack);
    }
}