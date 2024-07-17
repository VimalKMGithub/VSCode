// Time Complexity: O(n)
// Space Complexity: O(n)
// factorial n using recursion
public class c0014_factorial_n {
    private int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
