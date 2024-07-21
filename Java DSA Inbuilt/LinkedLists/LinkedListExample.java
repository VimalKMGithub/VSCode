package LinkedLists;

import java.util.ArrayList;
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
        ArrayList<String> al = new ArrayList<String>();
        al.add("Hello");
        al.add("World");
        doublyLL.addAll(al); /*
                              * add all elements of al to doublyLL by default at the end we can pass
                              * another collection like list, set, ArrayList, etc.
                              */
        doublyLL.addAll(2, al); /* add all elements of al to doublyLL at index 2 */
        System.out.println(doublyLL);

        doublyLL.contains("Hello"); /* check if element is present */
        doublyLL.containsAll(al); /* check if all elements of al are present */
        doublyLL.clear(); /* remove all elements */
        System.out.println(doublyLL);

        doublyLL.add("Mr.");
        doublyLL.add("Vimal");
        doublyLL.add("is");
        doublyLL.add("God");
        doublyLL.add("Hello");
        doublyLL.add("World");
        doublyLL.add("Hello");
        doublyLL.add("World");
        doublyLL.add("Hello1");
        doublyLL.add("World1");
        doublyLL.add("Hello2");
        doublyLL.add("World2");
        doublyLL.add("the");
        doublyLL.add("the");
        System.out.println(doublyLL);

        doublyLL.remove(); /* by default it will remove first element */
        doublyLL.removeFirst();
        doublyLL.removeLast();
        doublyLL.remove(2); /* remove element at index 2 */
        doublyLL.remove("the"); /* remove element "the" by default it will remove first occurrence */
        doublyLL.removeFirstOccurrence("the"); /* remove first occurrence of element "the" */
        doublyLL.removeLastOccurrence("the"); /* remove last occurrence of element "the" */
        doublyLL.removeAll(al); /* remove all elements of al from doublyLL all occurrences */
        System.out.println(doublyLL);

        doublyLL.removeIf(str -> str.contains("i")); /* remove all elements which contains "i" */
        System.out.println(doublyLL);

        doublyLL.clear(); /* remove all elements */
        doublyLL.add("Mr.");
        doublyLL.add("Vimal");
        doublyLL.add("is");
        doublyLL.add("God");
        doublyLL.contains("Vimal"); /* check if element is present */
        doublyLL.containsAll(al); /* check if all elements of al are present */
        doublyLL.isEmpty(); /* check if LinkedList is empty */
        doublyLL.size(); /* get size of LinkedList */
        doublyLL.getFirst(); /* get first element */
        doublyLL.getLast(); /* get last element */
        doublyLL.get(0); /* get element at index 0 */
        doublyLL.indexOf("Vimal"); /* get index of element "Vimal" */
        doublyLL.lastIndexOf("Vimal"); /* get last index of element "Vimal" */
        doublyLL.set(0, "Yes"); /*
                                 * set element at index 0 means replace value at index 0, it is different from
                                 * add(int index, E element)
                                 */
        doublyLL.subList(0, 2); /* get sublist from index 0 to 2, 2 is exclusive */
        doublyLL.replaceAll(str -> str + "1"); /* replace all elements with str + "1" */
        doublyLL.element(); /* get first element */
        System.out.println(doublyLL);

        doublyLL.offer("Hello"); /* add element at last */
        System.out.println(doublyLL);

        doublyLL.offerFirst("Mr."); /* add element at first */
        doublyLL.offerLast("World"); /* add element at last */

        LinkedList<String> doublyLL2 = new LinkedList<String>();
        doublyLL2.add("Hello");
        doublyLL2.add("World");
        doublyLL.equals(doublyLL2); /* check if both LinkedLists are equal */
        doublyLL.peek(); /* get first element */
        doublyLL.peekFirst(); /* get first element */
        doublyLL.peekLast(); /* get last element */

        doublyLL.poll(); /* remove first element */
        doublyLL.pollFirst(); /* remove first element */
        doublyLL.pollLast(); /* remove last element */
        doublyLL.push("Hello"); /* add element at first */
        doublyLL.pop(); /* remove first element */
        doublyLL.retainAll(doublyLL2); /* remove all elements except doublyLL2 */
        doublyLL.reversed(); /* reverse the LinkedList */
        doublyLL.sort(null); /* sort the LinkedList in ascending order */
        doublyLL.sort((str1, str2) -> str1.compareTo(str2)); /* sort the LinkedList in ascending order */
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