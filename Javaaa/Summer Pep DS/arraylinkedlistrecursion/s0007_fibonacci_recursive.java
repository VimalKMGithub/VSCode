// Time Complexity: O(n)
// Space Complexity: O(n)
// fibonacci series using recursion
public class s0007_fibonacci_recursive {
    private int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}
