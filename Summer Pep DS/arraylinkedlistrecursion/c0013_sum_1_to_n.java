// Time Complexity: O(n)
// Space Complexity: O(n)
// sum 1 to n using recursion
public class c0013_sum_1_to_n {
    private int sum1ToN(int n) {
        if (n == 1) {
            return 1;
        }
        return sum1ToN(n - 1) + n;
    }
}
