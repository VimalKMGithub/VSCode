package LinkedLists;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> doublyLL = new LinkedList<String>(); /* by default it is doubly linked list */
        doublyLL.addFirst("Mr.");
        doublyLL.addFirst("Vimal");
        doublyLL.addLast("is");
        doublyLL.add("God"); /* by default it will add at the end */
        doublyLL.add(2, "the"); /*
                                 * add at index 2, if index is not present it will throw
                                 * IndexOutOfBoundsException
                                 */
        System.out.println(doublyLL);

        doublyLL.remove(); /* by default it will remove first element */
        doublyLL.removeFirst();
        doublyLL.removeLast();
        System.out.println(doublyLL);

        /* other ways to create LinkedList */
        LinkedList<String> test = new LinkedList<String>();
        test.add("Hello");
        test.add("World");
        LinkedList<String> test2 = new LinkedList<String>(test); /*
                                                                  * in constructor we can pass another collection like
                                                                  * list, set, ArrayList, etc.
                                                                  */
    }
}