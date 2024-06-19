
// Time Complexity: O(n*2^n)
// Space Complexity: O(n*2^n)
// sum of digits using recursion
import java.util.ArrayList;

public class c0016_subsets {
    private void subsets(char[] arr, int currentIndex, ArrayList<Character> currentResult,
            ArrayList<ArrayList<Character>> finalResult) {
        if (currentIndex == arr.length) {
            finalResult.add(new ArrayList<Character>(currentResult));
            return;
        }
        subsets(arr, currentIndex + 1, currentResult, finalResult);
        currentResult.add(arr[currentIndex]);
        subsets(arr, currentIndex + 1, currentResult, finalResult);
        currentResult.remove(currentResult.size() - 1);
    }
}
