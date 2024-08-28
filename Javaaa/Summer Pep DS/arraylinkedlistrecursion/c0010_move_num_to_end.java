
// Time Complexity: O(n)
// Space Complexity: O(1)
// move num to end
import java.util.Arrays;

public class c0010_move_num_to_end {
    public static void main(String[] args) {
        c0010_move_num_to_end solution = new c0010_move_num_to_end();
        int[] arr = { 2, 1, 2, 2, 2, 3, 4, 2 };
        solution.moveNumToEnd(arr, 2);
        System.out.println(Arrays.toString(arr));
    }

    private void moveNumToEnd(int[] arr, int numToMove) {
        int copyPtr = 0;
        int checkPtr = 0;
        while (checkPtr < arr.length) {
            if (arr[checkPtr] != numToMove) {
                arr[copyPtr] = arr[checkPtr];
                copyPtr++;
            }
            checkPtr++;
        }
        while (copyPtr < arr.length) {
            arr[copyPtr] = numToMove;
            copyPtr++;
        }
    }
}
