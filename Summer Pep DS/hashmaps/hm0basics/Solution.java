package hashmaps.hm0basics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Solution {
    static class Employee {
        int id;
        String name;
        int salary;

        public Employee(int id, String name, int salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }

    public static void main(String[] args) {
        HashMap<Integer, Employee> employeeHashMap = new HashMap<>(); // unordered
        employeeHashMap.put(1, new Employee(1, "ABC", 10));
        employeeHashMap.put(2, new Employee(2, "DEF", 12));
        employeeHashMap.put(3, new Employee(3, "GHI", 5));
        employeeHashMap.put(2, new Employee(2, "LOL", 120)); // override first value

        // System.out.println(employeeHashMap.get(2));

        // System.out.println(employeeHashMap.get(1));
        // System.out.println(employeeHashMap.get(89));

        // System.out.println(employeeHashMap.getOrDefault(11, new Employee(-1, "",
        // -1)));
        // if (employeeHashMap.containsKey(73)) {
        // System.out.println("Yes");
        // } else {
        // System.out.println("No");
        // }

        for (Integer key : employeeHashMap.keySet()) {
            System.out.println(employeeHashMap.get(key));
        }
        System.out.println();

        for (Employee val : employeeHashMap.values()) {
            System.out.println(val);
        }
        System.out.println();

        employeeHashMap.remove(2);
        for (HashMap.Entry<Integer, Employee> entry : employeeHashMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        System.out.println();

        System.out.println(employeeHashMap.size());

        System.out.println();

        HashSet<Integer> hashSet = new HashSet<>(); // unordered
        hashSet.add(1);

        if (hashSet.contains(1)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        System.out.println();

        hashSet.remove(1);

        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);

        for (Integer val : hashSet) {
            System.out.println(val);
        }
        System.out.println();

        System.out.println(hashSet.size());

        // LinkedHashMap<Integer, Employee> lsm = new LinkedHashMap<>(); // ordered
        // LinkedHashSet<Integer> lss = new LinkedHashSet<>(); // ordered

        // TreeMap<Integer, Employee> treeMap = new TreeMap<>(); // sorted
        // TreeSet<Integer> treeSet = new TreeSet<>(); // sorted

        // TreeSet<Employee> treeSet = new TreeSet<>(new Comparator<Employee>() {
        // @Override
        // public int compare(Employee o1, Employee o2) {
        // return o1.id - o2.id;
        // }
        // });

        // TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());

        // MultiMap
        // HashMap<Integer, ArrayList<Employee>> multiMap = new HashMap<>();
        // HashMap<Integer, HashSet<Employee>> multiMap = new HashMap<>();

        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        // ArrayList<Integer> valsForKey = hm.getOrDefault(1, new ArrayList<>());
        // valsForKey.add(2);
        // hm.put(1, valsForKey);

        if (hm.containsKey(1)) {
            hm.get(1).add(2);
        } else {
            ArrayList<Integer> vals = new ArrayList<>();
            vals.add(2);
            hm.put(1, vals);
        }
    }
}