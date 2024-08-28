package queue;

import java.util.Stack;

public class TwoStackBasedQueuePushCostlier implements Queue {
    private Stack<Integer> mainStack;
    private Stack<Integer> intermediateStack;

    // Time complexity: O(n)
    // Space complexity: O(n)
    @Override
    public void push(int newVal) {
        moveAllElementsToOtherStack();
        mainStack.push(newVal);
        moveBackAllElementsToMainStack();
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

    private void moveAllElementsToOtherStack() {
        while (!mainStack.empty()) {
            intermediateStack.push(mainStack.pop());
        }
    }

    private void moveBackAllElementsToMainStack() {
        while (!intermediateStack.empty()) {
            mainStack.push(intermediateStack.pop());
        }
    }
}