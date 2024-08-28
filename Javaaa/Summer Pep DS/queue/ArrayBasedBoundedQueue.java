package queue;

public class ArrayBasedBoundedQueue implements Queue {
    private int[] qArray;
    private int last = -1;
    private int first = -1;
    private int capacity;
    int length = 0;

    public ArrayBasedBoundedQueue(int capacity) {
        this.qArray = new int[capacity];
        this.capacity = capacity;
    }

    @Override
    public void push(int newVal) {
        if (isFull()) {
            System.out.println("Queue is full, can't push new element");
            return;
        }
        if (isEmpty()) {
            first = 0;
            last = 0;
        } else {
            last = (last + 1) % capacity;
        }
        length++;
        qArray[last] = newVal;
    }

    @Override
    public Integer poll() {
        if (isEmpty()) {
            return null;
        }
        Integer firstValue = peek();
        length--;
        if (onlySingleElementInQ()) {
            first = -1;
            last = -1;
        } else {
            first = (first + 1) % capacity;
        }
        return firstValue;
    }

    @Override
    public Integer peek() {
        if (isEmpty()) {
            return null;
        }
        return qArray[first];
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }

    public boolean isFull() {
        return (last + 1) % capacity == first;
    }

    private boolean onlySingleElementInQ() {
        return last == first;
    }
}