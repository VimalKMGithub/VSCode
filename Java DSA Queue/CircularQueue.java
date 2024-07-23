public class CircularQueue {
    private int[] queue;
    private int head;
    private int tail;
    private int size;

    public CircularQueue(int capacity) {
        queue = new int[capacity];
        head = 0;
        tail = 0;
        size = 0;
    }

    public void enqueue(int item) {
        if (size == queue.length) {
            throw new RuntimeException("Queue is full");
        }
        queue[tail] = item;
        tail = (tail + 1) % queue.length;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            throw new RuntimeException("Queue is empty");
        }
        int item = queue[head];
        head = (head + 1) % queue.length;
        size--;
        return item;
    }

    public int peek() {
        if (size == 0) {
            throw new RuntimeException("Queue is empty");
        }
        return queue[head];
    }

    public int peekTail() {
        if (size == 0) {
            throw new RuntimeException("Queue is empty");
        }
        return queue[tail - 1 < 0 ? queue.length - 1 : tail - 1];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == queue.length;
    }

    public int size() {
        return size;
    }
}