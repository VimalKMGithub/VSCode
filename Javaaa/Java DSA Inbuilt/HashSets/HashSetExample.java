package HashSets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* HashSet is a collection of items where every item is unique. It is used to store unique items. It is widely used in the banking sector, e-commerce, etc. It is a part of the Java Collection Framework. It implements the Set interface. */
/* Hashset has methods similar to arrayList and linkedList + some additional methods */
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.add(1); /* add() method is used to add elements to the hashSet */
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);

        /* additional methods */
        Iterator<Integer> iterator = hashSet.iterator(); /* returns an iterator */
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        /* we can also use for-each loop */
        for (Integer integer : hashSet) {
            System.out.println(integer);
        }

        /* other ways to create a HashSet */
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        HashSet<Integer> hashSet2 = new HashSet<>(list); /*
                                                          * in this constructor we can pass another collection like
                                                          * list, set,
                                                          * ArrayList, etc.
                                                          */
    }
}