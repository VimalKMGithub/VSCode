import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class day8n {
    public static void main(String[] args) {
        // int arr[] = { 8, 6, 7, 6, 4, 1, 1, 3 };
        // for (int i = 0; i < arr.length - 1; i++) {
        // boolean isSwapped = false;
        // for (int j = 0; j < arr.length - i - 1; j++) {
        // if (arr[j] > arr[j + 1]) {
        // arr[j] += arr[j + 1];
        // arr[j + 1] = arr[j] - arr[j + 1];
        // arr[j] -= arr[j + 1];
        // isSwapped = true;
        // }
        // }
        // if (isSwapped == false) {
        // break;
        // }
        // }
        // Set<Integer> duplicates = new HashSet<>();
        // for (int i = 0; i < arr.length - 1; ++i) {
        // if (arr[i] == arr[i + 1]) {
        // duplicates.add(arr[i]);
        // }
        // }
        // System.out.println(duplicates);

        // String strInput = "ironman";
        // char[] charArray = strInput.toCharArray();
        // Arrays.sort(charArray);
        // String sortedStr = new String(charArray);
        // System.out.println(sortedStr);

        // String strInput = "ironman";
        // char[] charArray = strInput.toCharArray();
        // int n = charArray.length;
        // for (int i = 0; i < n - 1; i++) {
        // for (int j = 0; j < n - i - 1; j++) {
        // if (charArray[j] > charArray[j + 1]) {
        // char temp = charArray[j];
        // charArray[j] = charArray[j + 1];
        // charArray[j + 1] = temp;
        // }
        // }
        // }
        // String sortedStr = new String(charArray);
        // System.out.println(sortedStr);

        // // Given two integer arrays nums1 and nums2, return an array of their
        // // intersection. Each element in the result must be unique and you may return
        // // the result in any order.
        // // Example 1:
        // // Input: nums1 = [1,2,2,1], nums2 = [2,2]Output: [2]
        // // Example 2:
        // // Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]Output: [9,4]Explanation: [4,9]
        // // is also accepted.
        // // 1st approach
        // int[] A = { 1, 2, 2, 1 };
        // int[] B = { 2, 2 };
        // Set<Integer> common = new HashSet<>();
        // for (int i : A) {
        // for (int j : B) {
        // if (i == j) {
        // common.add(i);
        // }
        // }
        // }
        // System.out.println(common);
        // // 2nd approach
        // int[] A = { 1, 2, 2, 1 };
        // int[] B = { 2, 2 };
        // Set<Integer> setA = new HashSet<>();
        // for (int a : A) {
        // setA.add(a);
        // }
        // Set<Integer> setB = new HashSet<>();
        // for (int b : B) {
        // setB.add(b);
        // }
        // setA.retainAll(setB);
        // System.out.println(setA);
    }
}
// Raj has been given an array which is partially sorted and he wants to sort it
// using an algorithm . Suggest an algorithm to him which will work best for him
// options
// 1: A Bubble Sort
// 2: B Selection Sort
// 3: C Insertion Sort [correct answer is C]

// Which among the following is most stable sorting algorithm.
// options
// 1: A Selection Sort
// 2: B Bubble Sort
// 3: C Insertion Sort [correct answer is C]