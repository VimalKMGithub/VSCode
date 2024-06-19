
// Time Complexity: O(n)
// Space Complexity: O(1)
// move all 3s at the end of the array retaining the order of other elements
import java.util.Arrays;

public class s0001_move_all_3s_at_the_end {
    public static void main(String[] args) {
        s0001_move_all_3s_at_the_end solution = new s0001_move_all_3s_at_the_end();
        int[] arr = { 3, 2, 3, 3, 6, 3, 10, 3, 3, 20, 3, 3 };
        solution.moveAll3sAtTheEnd(arr);
        System.out.println(Arrays.toString(arr));
    }

    private void moveAll3sAtTheEnd(int[] arr) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 3) {
                arr[count++] = arr[i];
            }
        }
        while (count < n) {
            arr[count++] = 3;
        }
    }
}
