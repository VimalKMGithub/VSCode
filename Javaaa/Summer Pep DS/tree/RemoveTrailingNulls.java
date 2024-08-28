package tree;

import java.util.Arrays;

public class RemoveTrailingNulls {
    public Integer[] removeTrailingNulls(Integer[] arr) {
        int lastNonNullIndex = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != null) {
                lastNonNullIndex = i;
                break;
            }
        }
        if (lastNonNullIndex == -1) {
            return new Integer[0];
        }
        return Arrays.copyOf(arr, lastNonNullIndex + 1);
    }

    public static void main(String[] args) {
        Integer[] arr = { 1, 2, null, null, 3, null, null, null };
        RemoveTrailingNulls sol = new RemoveTrailingNulls();
        Integer[] result = sol.removeTrailingNulls(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(result));
    }
}