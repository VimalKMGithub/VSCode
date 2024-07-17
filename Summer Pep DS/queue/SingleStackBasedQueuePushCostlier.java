package queue;

import java.util.Stack;

public class SingleStackBasedQueuePushCostlier implements Queue {
    private Stack<Integer> mainStack;

    // Time complexity: O(n)
    // Space complexity: O(n)
    @Override
    public void push(int newVal) {
        insertValueAtBottom(mainStack, newVal);
    }

    // Time complexity: O(1)
    // Space complexity: O(1)
    @Override
    public Integer poll() {
        if (isEmpty()) {
            return null;
        }
        return mainStack.pop();
    }

    // Time complexity: O(1)
    // Space complexity: O(1)
    @Override
    public Integer peek() {
        if (isEmpty()) {
            return null;
        }
        return mainStack.peek();

    }

    @Override
    public int size() {
        return mainStack.size();
    }

    @Override
    public boolean isEmpty() {
        return mainStack.isEmpty();
    }

    public void insertValueAtBottom(Stack<Integer> stack, int valToAdd) {
        if (stack.empty()) {
            stack.push(valToAdd);
            return;
        }
        int topValue = stack.pop();
        insertValueAtBottom(stack, valToAdd);
        stack.push(topValue);
    }
}