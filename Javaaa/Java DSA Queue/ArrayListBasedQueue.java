import java.util.ArrayList;

public class ArrayListBasedQueue {
    private ArrayList<Integer> queue;

    public ArrayListBasedQueue() {
        queue = new ArrayList<Integer>();
    }

    public void enqueue(int item) {
        queue.add(item);
    }

    public int dequeue() {
        if (queue.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return queue.remove(0);
    }

    public int peek() {
        if (queue.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return queue.get(0);
    }

    public int peekTail() {
        if (queue.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return queue.get(queue.size() - 1);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }
}