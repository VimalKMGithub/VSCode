package ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>(); /* by default it is dynamic array */
        al.add("Mr."); /* by default it will add at the end */
        al.add("Vimal");
        al.add("is");
        al.add("God");
        al.add(2, "the"); /*
                           * add at index 2, if index is not present it will throw
                           * IndexOutOfBoundsException
                           */
        al.addFirst("First"); /* add at first index */
        al.addLast("Last"); /* add at last index */
        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Hello");
        al2.add("World");

        al.addAll(al2); /*
                         * add all elements of al2 to al by default at the end we can pass another
                         * collection likelist, set, LinkedList, etc.
                         */
        al.addAll(2, al2); /* add all elements of al2 to al at index 2 */
        System.out.println(al);

        al.remove(0); /* remove element at index 0 */
        al.remove("the"); /* remove element "the" */
        al.removeFirst(); /* remove first element */
        al.removeLast(); /* remove last element */
        al.removeAll(al2); /* remove all elements of al2 from al all occurences */
        al.removeIf(str -> str.contains("i")); /* remove all elements which contains "i" */
        System.out.println(al);

        al.clear(); /* remove all elements */
        System.out.println(al);

        al.add("Mr.");
        al.add("Vimal");
        al.add("is");
        al.add("God");
        System.out.println(al);

        boolean isPresent = al.contains("Vimal"); /* check if element is present */
        System.out.println(isPresent);

        al.set(0, "Yes"); /*
                           * set element at index 0 means replace value at index 0, it is different from
                           * add(int index, E element)
                           */
        System.out.println(al);

        al.get(0); /* get element at index 0 */
        al.indexOf("Vimal"); /* get index of element "Vimal" */
        al.lastIndexOf("Vimal"); /* get last index of element "Vimal" */
        al.size(); /* get size of ArrayList */
        al.isEmpty(); /* check if ArrayList is empty */
        al.getFirst(); /* get first element */
        al.getLast(); /* get last element */
        List<String> subl = al.subList(0, 2); /* get sublist from index 0 to 2, 2 is exclusive */
        System.out.println(subl);

        al.replaceAll(str -> str + "1"); /* replace all elements with str + "1" */
        System.out.println(al);

        ArrayList<String> al3 = new ArrayList<String>();
        al3.add("Mr.");
        al3.add("Vimal1");
        boolean isContains = al.containsAll(al3); /*
                                                   * check if all elements of subl are present in al we can pass another
                                                   * collection like list, set, LinkedList, etc.
                                                   */
        System.out.println(isContains);

        boolean isEqual = al.equals(al3); /* check if both ArrayLists are equal */
        System.out.println(isEqual);

        List<String> rl = al.reversed(); /* reverse the ArrayList */
        System.out.println(rl);

        al.sort(null); /* sort the ArrayList in ascending order */
        System.out.println(al);

        al.sort((str1, str2) -> str1.compareTo(str2)); /* sort the ArrayList in ascending order */
        System.out.println(al);

        al.add("Hello");
        al.add("World");
        System.out.println(al);

        al.retainAll(al2); /* retain all elements of rl in al */
        System.out.println(al);

        /* other ways to create ArrayList */
        ArrayList<String> test = new ArrayList<String>();
        test.add("Hello");
        test.add("World");
        ArrayList<String> test2 = new ArrayList<String>(test); /*
                                                                * in constructor we can pass another collection like
                                                                * list, set, LinkedList, etc.
                                                                */
    }
}