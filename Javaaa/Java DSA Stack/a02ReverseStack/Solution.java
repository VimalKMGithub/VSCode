package a02ReverseStack;

import java.util.Stack;

public class Solution {
    public void reverse(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return;
        }
        Integer popValue = stack.pop();
        reverse(stack);
        insertValueAtBottom(stack, popValue);
    }

    private void insertValueAtBottom(Stack<Integer> stack, Integer val) {
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

        Solution sol = new Solution();
        System.out.println(stack);
        sol.reverse(stack);
        System.out.println(stack);
    }
}