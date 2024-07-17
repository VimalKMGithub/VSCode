// Time Complexity: O(n)
// Space Complexity: O(n)
// duplicate zero in an array
public class n0003_duplicate_zeros {
    private int[] duplicateZeros(int[] arr) {
        int zeroCount = 0;
        for (int i : arr) {
            if (i == 0) {
                zeroCount++;
            }
        }
        int[] res = new int[arr.length + zeroCount];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        int ptr = arr.length - 1;
        while (zeroCount > 0) {
            res[ptr + zeroCount] = res[ptr];
            if (res[ptr] == 0) {
                res[ptr + zeroCount - 1] = 0;
                zeroCount--;
            }
            ptr--;
        }
        return res;
    }
}
