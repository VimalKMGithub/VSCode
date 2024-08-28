import java.util.*;

public class day7n {
    public static void main(String[] args) {
        // // 1st approach
        // int arr[] = { 2, 3, 1, 2, 3 };
        // Map<Integer, Integer> mp = new HashMap<>();
        // for (int i = 0; i < arr.length; i++) {
        // if (mp.containsKey(arr[i])) {
        // mp.put(arr[i], mp.get(arr[i]) + 1);
        // } else {
        // mp.put(arr[i], 1);
        // }
        // }
        // for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
        // if (entry.getValue() > 1) {
        // System.out.println(entry.getKey());
        // }
        // }
        // // 2nd approach
        // int[] a = { 2, 3, 1, 2, 3, 2, 2, 4, 4, 4, 4 };
        // HashSet<Integer> set = new HashSet<>();
        // HashSet<Integer> dup = new HashSet<>();
        // for (int value : a) {
        // if (set.add(value) == false) {
        // dup.add(value);
        // }
        // }
        // for (int duplicate : dup) {
        // System.out.println(duplicate);
        // }

        // double n = 25;
        // System.out.println(Math.sqrt(n));

        // // Input:n1 = 6; A = {1, 5, 10, 20, 40, 80}
        // // n2 = 5; B = {6, 7, 20, 80, 100}
        // // n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
        // // Output: 20 80
        // // write a code to find the common elements in the array.
        // // 1st approach
        // int[] A = { 1, 5, 10, 20, 40, 80 };
        // int[] B = { 6, 7, 20, 80, 100 };
        // int[] C = { 3, 4, 15, 20, 30, 70, 80, 120 };
        // Set<Integer> common = new HashSet<>();
        // for (int i : A) {
        // for (int j : B) {
        // for (int k : C) {
        // if (i == j && j == k) {
        // common.add(i);
        // }
        // }
        // }
        // }
        // System.out.println(common);
        // // 2nd approach
        // int[] A = { 1, 5, 10, 20, 40, 80 };
        // int[] B = { 6, 7, 20, 80, 100 };
        // int[] C = { 3, 4, 15, 20, 30, 70, 80, 120 };
        // Set<Integer> setA = new HashSet<>();
        // for (int a : A) {
        // setA.add(a);
        // }
        // Set<Integer> setB = new HashSet<>();
        // for (int b : B) {
        // setB.add(b);
        // }
        // Set<Integer> setC = new HashSet<>();
        // for (int c : C) {
        // setC.add(c);
        // }
        // setA.retainAll(setB);
        // setA.retainAll(setC);
        // System.out.println(setA);
    }
}

// class A{
// }
// enum Enum extends A{
// ABC, BCD, CDE, DEF;
// }
// What will be the output of the code.
// error

// enum directions {
// N, S, W, E;

// private directions() {
// System.out.println(1);
// }
// }

// class mainc {
// public static void main(String[] args) {
// directions d1 = new directions();
// }
// }
// What would be the output of the code on screen?
// options
// 1: A 1
// 2: B Compilation error [correct answer is B]
// 3: C Runtime Error
// 4: D None of the above

// What is the time complexity of HashMap.
// options
// 1: A O(n)
// 2: B O(nlogn)
// 3: C O(n*n)
// 3: D none of these [correct answer is B, since it is O[1]]

// what is the time complexity of finding square roots using Math.sqrt()
// O(1)