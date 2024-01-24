class QueueNode {
    public QueueNode next;
    public int data;

    public QueueNode(int key) {
        this.data = key;
        this.next = null;
    }
}

class test {
    QueueNode front, rear;

    public test() {
        this.front = this.rear = null;
    }

    void enQueue(int key) {
        QueueNode temp = new QueueNode(key);
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;
    }

    void deQueue() {
        if (this.front == null) {
            return;
        }
        // QueueNode temp= this.front;
        this.front = this.front.next;
        if (this.front == null) {
            this.rear = null;
        }
    }
}

public class QueueUsingLL {
    public static void main(String[] args) {
        test q = new test();
        q.enQueue(10);
        q.enQueue(11);
        q.enQueue(12);
        System.out.println(q.front.data + " " + q.rear.data);
        q.deQueue();
        q.deQueue();
        q.deQueue();
        System.out.println(q.front.data + " " + q.rear.data);
    }
}