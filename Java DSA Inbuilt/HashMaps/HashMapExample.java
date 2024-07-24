package HashMaps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one"); /* put() method is used to add elements to the map */
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");

        map.containsKey(1); /* returns true if the map contains the key */
        map.containsValue("one"); /* returns true if the map contains the value */
        map.clear(); /* removes all the elements from the map */
        map.isEmpty(); /* returns true if the map is empty */
        map.size(); /* returns the size of the map */

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");

        HashMap<Integer, String> map2 = new HashMap<>(map); /* you can pass another map */
        map2.remove(1); /* removes the element with the key 1 */
        boolean result = map.equals(map2); /* returns true if both maps are equal */
        System.out.println(result);

        map.get(2); /* returns the value of the key 2 */
        String ans = map.getOrDefault(5, "not found"); /* returns the value of the key 2 */
        System.out.println(ans);

        map2.clear();
        map2.put(5, "five");
        map2.put(6, "six");
        map.putAll(map2); /* adds all the elements of map2 to map */
        map.put(0, "zero");
        map.replace(1, "one1"); /* replaces the value of the key 1 with "one1" */
        map.replace(1, "one2", "ONE"); /* replaces the value of the key 1 with "ONE" if the value is "one2" */
        map.putIfAbsent(0, ans); /* adds the key-value pair if the key is not present in the map */
        Set<Integer> keys = map.keySet(); /* returns a set of keys */
        for (Integer integer : keys) {
            System.out.println(map.get(integer));
        }

        Collection<String> vals = map.values(); /* returns a collection of values */
        System.out.println(vals);

        map.forEach((k, v) -> System.out.println(k + " " + v)); /* prints all the key-value pairs */
        map.replaceAll((k, v) -> v.toUpperCase()); /* replaces all the values with their uppercase */
        map.remove(0, "zero"); /* removes the key-value pair if the key is 0 and the value is "zero" */
        map.forEach((k, v) -> System.out.println(k + " " + v));

        System.out.println();
        Set<HashMap.Entry<Integer, String>> entries = map.entrySet(); /* returns a set of key-value pairs */
        for (HashMap.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();

        /* we can use entryset to modify the values */
        for (HashMap.Entry<Integer, String> entry : entries) {
            entry.setValue(entry.getValue().toLowerCase());
        }
        System.out.println(map);
        System.out.println();

        List<HashMap.Entry<Integer, String>> list = new ArrayList<>(map.entrySet());
        for (HashMap.Entry<Integer, String> entry : list) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println();
        System.out.println(list);

        /* other ways to create a HashMap */
        HashMap<Integer, String> test = new HashMap<>();
        test.put(1, "one");
        test.put(2, "two");
        test.put(3, "three");

        HashMap<Integer, String> test2 = new HashMap<>(test); /* you can pass another map */
    }
}