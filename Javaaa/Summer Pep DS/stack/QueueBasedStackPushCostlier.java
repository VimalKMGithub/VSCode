package stack;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBasedStackPushCostlier implements Stack {
    private Queue<Integer> queue = new LinkedList<>();

    // Time: O(n)
    // Space: O(1)
    @Override
    public void push(Integer newVal) {
        queue.add(newVal);
        moveNElementsAtEnd(queue, size() - 1);
    }

    // Time: O(1)
    // Space: O(1)
    @Override
    public Integer poll() {
        if (isEmpty()) {
            return null;
        }
        return queue.poll();
    }

    // Time: O(1)
    // Space: O(1)
    @Override
    public Integer top() {
        if (isEmpty()) {
            return null;
        }
        return queue.peek();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public void print() {
        System.out.println(queue);
    }

    private void moveNElementsAtEnd(Queue<Integer> q, int n) {
        if (q.isEmpty() || q.size() == 1) {
            return;
        }
        n = n % q.size();
        while (n > 0) {
            int val = q.poll();
            q.add(val);
            n--;
        }
    }
}