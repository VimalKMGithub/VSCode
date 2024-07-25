package Q01ArrayManipulation;

import java.util.List;

class Result {
    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        long[] arr = new long[n];
        for (List<Integer> query : queries) {
            int a = query.get(0);
            int b = query.get(1);
            int k = query.get(2);
            arr[a - 1] += k;
            if (b < n) {
                arr[b] -= k;
            }
        }
        long max = 0;
        long sum = 0;
        for (long num : arr) {
            sum += num;
            max = Math.max(max, sum);
        }
        return max;
    }
}

public class Solution {
}