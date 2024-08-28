package heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

public class Solution {
    static class Value {
        int v1, v2, v3;
    }

    static class Student {
        int cgpa;
        int id;
        String name;
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(25, 20, 11, 15, 13, 12, 15, 19, 9, 8, 7, 7));
        PriorityQueue<Integer> pq0 = new PriorityQueue<>();

        // PriorityQueue<Integer> pq = new PriorityQueue<>(nums);

        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // new TreeMap<>(Collections.reverseOrder());
        // new TreeSet<>(Collections.reverseOrder());
        // pq.addAll(nums);
        // System.out.println(pq);

        // PriorityQueue<Value> pq = new PriorityQueue<>((p1, p2) -> p1.v1 - p2.v1);

        // PriorityQueue<Student> pq = new PriorityQueue<>(new Comparator<Student>() {
        // @Override
        // public int compare(Student o1, Student o2) {
        // return o1.cgpa - o2.cgpa;
        // }
        // });

        // Student s1 = new Student();
        // s1.cgpa = 8;
        // s1.name = "aimal";

        // Student s2 = new Student();
        // s2.cgpa = 8;
        // s2.name = "Vimal";

        // List<Student> sd = new ArrayList<>(Arrays.asList(s1, s2));

        // PriorityQueue<Student> pq = new PriorityQueue<>(new Comparator<Student>() {
        // @Override
        // public int compare(Student o1, Student o2) {
        // if (o1.cgpa < o2.cgpa) {
        // return -1;
        // } else if (o1.cgpa > o2.cgpa) {
        // return 1;
        // } else {
        // return o1.name.compareTo(o2.name);
        // }
        // }
        // });

        // PriorityQueue<Student> pq = new PriorityQueue<>(new Comparator<Student>() {
        // @Override
        // public int compare(Student o1, Student o2) {
        // if (o1.cgpa < o2.cgpa) {
        // return 1;
        // } else if (o1.cgpa > o2.cgpa) {
        // return -1;
        // } else {
        // return -1 * o1.name.compareTo(o2.name);
        // }
        // }
        // });

        // pq.addAll(sd);

        // for (Student student : pq) {
        // System.out.println(student.name + ", " + student.cgpa);
        // }

        // PriorityQueue<Value> pq = new PriorityQueue<>(new Comparator<Value>() {
        // @Override
        // public int compare(Value o1, Value o2) {
        // return o1.v1 - o2.v1;
        // }
        // });

        pq0.addAll(nums);
        System.out.println(pq0); // unsored
        for (Integer val : pq0) {
            System.out.println(val);
        }

        // TreeSet<Integer> ts = new TreeSet<>(pq0);
        // System.out.println(ts); // sorted

        // pq0.add(102); // add min or max
        // pq0.peek(); // provide min or max
        // pq0.poll(); // remove min or max
    }
}