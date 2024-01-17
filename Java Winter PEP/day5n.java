import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class day5n {
    public static void main(String[] args) {
        // String a = "vimal";
        // String b = "";
        // for (int i = a.length() - 1; i >= 0; i--) {
        // b += a.charAt(i);
        // }
        // System.out.println(b);

        // String a = "abcba";
        // String b = "";
        // for (int i = a.length() - 1; i >= 0; i--) {
        // b += a.charAt(i);
        // }
        // if (a.equals(b)) {
        // System.out.println("Palindrome");
        // } else {
        // System.out.println("Not a Palindrome");
        // }

        int arr[] = { 1, 1, 2, 2, 3, 4, 5, 1, 2 };
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            } else {
                mp.put(arr[i], 1);
            }
        }
        System.out.println(Collections.max(mp.values()));
    }
}
// what is the write syntax to find the length of string str?
// options
// 1: A. str.length
// 2: B str.size()
// 3: C str.length() [correct answer is C]

// hasnext() in iterator returns the value of next element present
// options
// 1: A. true
// 2: B false [correct answer is B]