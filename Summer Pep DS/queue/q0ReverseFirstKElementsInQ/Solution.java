package queue.q0ReverseFirstKElementsInQ;

import java.util.Queue;
import java.util.Stack;

public class Solution {
    void reverse(Queue<Integer> queue, int k) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        while (i < k) {
            stack.push(queue.poll());
            i++;
        }

        i = 0;
        while (i < k) {
            queue.add(stack.pop());
            i++;
        }
        moveNElementsAtEnd(queue, queue.size() - k);
    }

    void reverseRecursion(Queue<Integer> queue, int k) {
        if (k <= 1) {
            return;
        }
        reverseFirstKElementsAndAddThemAtEnd(queue, k);
        moveNElementsAtEnd(queue, queue.size() - k);
    }

    void reverseFirstKElementsAndAddThemAtEnd(Queue<Integer> queue, int k) {
        if (k <= 0) {
            return;
        }
        int firstValue = queue.poll();
        reverseFirstKElementsAndAddThemAtEnd(queue, k - 1);
        queue.add(firstValue);
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