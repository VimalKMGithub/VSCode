import java.util.Stack;

public class QueueUsingTwoStacks {
    private Stack<Integer> mainStack;
    private Stack<Integer> intermediateStack;

    public QueueUsingTwoStacks() {
        mainStack = new Stack<>();
        intermediateStack = new Stack<>();
    }

    public void push(int data) {
        while (!mainStack.isEmpty()) {
            intermediateStack.push(mainStack.pop());
        }
        mainStack.push(data);
        while (!intermediateStack.isEmpty()) {
            mainStack.push(intermediateStack.pop());
        }
    }

    public int pop() {
        if (mainStack.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return mainStack.pop();
    }

    public int peek() {
        if (mainStack.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return mainStack.peek();
    }

    public int size() {
        return mainStack.size();
    }

    public boolean isEmpty() {
        return mainStack.isEmpty();
    }
}