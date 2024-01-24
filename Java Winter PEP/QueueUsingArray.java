import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingArray {
    private int maxsize;
    private int[] queueArray;
    private int front, rear;
    private int currentSize;

    public QueueUsingArray(int size) {
        this.maxsize = size;
        this.queueArray = new int[size];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    public void insert(int item) {
        if (maxsize == currentSize) {
            System.out.println("Queue is full");
            return;
        }
        if (rear == maxsize - 1) {
            rear = -1;
        }
        queueArray[++rear] = item;
        currentSize++;
        System.out.println("item added");
    }

    public int delete() {
        if (currentSize == 0) {
            throw new RuntimeException("Queue is empty");
        }
        int temp = queueArray[front++];
        if (front == maxsize) {
            front = 0;
        }
        currentSize--;
        return temp;
    }

    public int peek() {
        return queueArray[front];
    }

    public static void main(String[] args) {
        // QueueUsingArray q = new QueueUsingArray(10);
        // q.insert(2);
        // q.insert(4);
        // System.out.println(q.delete());
        // System.out.println(q.delete());
        // q.insert(1);
        // System.err.println(q.delete());

        Queue<Integer> q = new LinkedList<Integer>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q);
        int item = q.remove();
        System.out.println(item);
        System.out.println(q);
        System.out.println(q.peek());
    }
}
