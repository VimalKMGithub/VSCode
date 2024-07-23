package Stacks;

import java.util.Enumeration;
import java.util.Stack;

/* stack has all methods similar to arrayList and linkedList + some aditional methods */
public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>(); /* it has only one constructor */
        stack.add("Mr."); /* by default it will add at the end */
        stack.add("Vimal");
        stack.add("is");
        stack.add("Vimal");

        /* additional methods */
        String[] arr = new String[stack.size()];
        stack.copyInto(arr); /* copy all elements of stack to array */
        for (String string : arr) {
            System.out.print(string + " ");
        }
        System.out.println();

        String str = stack.elementAt(0); /* get element at index 0, same as get(int index) */
        System.out.println(str);

        Enumeration<String> enumString = stack.elements(); /* returns an enumeration of the elements in the stack */
        while (enumString.hasMoreElements()) {
            System.out.print(enumString.nextElement() + " ");
        }
        System.out.println();

        stack.empty(); /* check if stack is empty same as isEmpty() */
        stack.firstElement(); /* get first element same as getFirst() */
        stack.lastElement(); /* get last element same as getLast() */

        int idx = stack.indexOf("Vimal", 2); /* get index of element "Vimal" from index 1 */
        System.out.println(idx);

        stack.insertElementAt("str", 2); /* insert element at index 2 same as add(int index, E element) */
        System.out.println(stack);
        idx = stack.lastIndexOf("Vimal", 4); /*
                                              * Returns the index of the last occurrence of the specified element in
                                              * this stack, searching backwards from index
                                              */
        System.out.println(idx);

        stack.peek(); /* get first element same as getFirst() */
        stack.pop(); /* remove first element same as removeFirst() */
        stack.push("Hello"); /* add element at first same as addFirst() */
        stack.removeElement("Vimal"); /* remove element "Vimal" same as remove(Object obj) */
        stack.removeElementAt(2); /* remove element at index 2 same as remove(int index) */
        stack.search("Vimal"); /* search element "Vimal" & return 1 based index */
        stack.setElementAt("Vimal", 0); /* set element at index 0 same as set(int index, E element) */

        System.out.println(stack);
        stack.setSize(2); /*
                           * Sets the size of this stack. If the new size is greater than the current
                           * size, new null items are added to the end of the stack. If the new size is
                           * less than the current size, all components at index newSize and greater are
                           * discarded.
                           */
        System.out.println(stack);
    }
}