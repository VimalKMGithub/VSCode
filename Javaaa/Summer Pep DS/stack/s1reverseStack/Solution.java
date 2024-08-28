package stack.s1reverseStack;

import java.util.Stack;

public class Solution {
    // Time: O(n), Space: O(n)
    public void insertValueAtBottom(Stack<Integer> stack, int valToAdd) {
        if (stack.empty()) {
            stack.push(valToAdd);
            return;
        }
        int topValue = stack.pop();
        insertValueAtBottom(stack, valToAdd);
        stack.push(topValue);
    }

    // Time: O(n^2), Space: O(n)
    public void reverseStack(Stack<Integer> stack) {
        if (stack.empty()) {
            return;
        }
        int valAtTop = stack.pop();
        reverseStack(stack);
        insertValueAtBottom(stack, valAtTop);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        Solution solution = new Solution();
        System.out.println(stack);
        solution.reverseStack(stack);
        System.out.println(stack);
    }
}
