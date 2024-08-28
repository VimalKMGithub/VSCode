public class c0015_sum_of_digits {
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // sum of digits using recursion
    private int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumOfDigits(n / 10);
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // sum of digits
    private int sumOfDigitsIterative(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}