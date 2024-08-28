package stack.s1deleteMiddleFromStack;

import java.util.Stack;

public class Solution {
    // Time: O(n), Space: O(n)
    public void deleteMiddleFromStack(Stack<Integer> stack) {
        if (stack.empty()) {
            return;
        }
        int middle = stack.size() / 2;
        deleteMiddleFromStack(stack, middle);
    }

    private void deleteMiddleFromStack(Stack<Integer> stack, int positionFromTop) {
        if (positionFromTop == 0) {
            stack.pop();
            return;
        }
        int topValue = stack.pop();
        deleteMiddleFromStack(stack, positionFromTop - 1);
        stack.push(topValue);
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
        solution.deleteMiddleFromStack(stack);
        System.out.println(stack);
    }
}