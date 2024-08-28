package Queues;

import java.util.LinkedList;
import java.util.Queue;

/* Queue has all methods similar to arrayList and linkedList + some aditional methods */
public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Mr."); /* by default it will add at the end */
        queue.add("Vimal");
        queue.add("is");
        queue.add("Vimal");

        String popped = queue.poll(); /* remove and return first element same as remove() */
        System.out.println(popped);

        String peeked = queue.peek();
        System.out.println(peeked);

        /* other ways to create a queue */
        Queue<String> test = new LinkedList<>();
        test.add("Hello");
        test.add("World");
        Queue<String> test2 = new LinkedList<>(test); /*
                                                       * in this constructor we can pass another collection like list,
                                                       * set, ArrayList, etc.
                                                       */
    }
}