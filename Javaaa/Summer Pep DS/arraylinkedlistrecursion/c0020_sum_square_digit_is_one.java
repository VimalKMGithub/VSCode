import java.util.HashSet;
import java.util.Set;

public class c0020_sum_square_digit_is_one {
    public static void main(String[] args) {
        c0020_sum_square_digit_is_one solution = new c0020_sum_square_digit_is_one();
        System.out.println(solution.isHappy(23));
        System.out.println(solution.isHappy(12));
    }

    // Time complexity: O(log n to base 10)
    // Space complexity: O(1)
    // sum of the square of the digits of a number
    private int sumSquareDigit(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    private boolean isHappy(int n) {
        int slow = n, fast = n;
        do {
            slow = sumSquareDigit(slow);
            fast = sumSquareDigit(sumSquareDigit(fast));
        } while (slow != fast);
        return slow == 1;
    }

    private boolean isHappy2(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = sumSquareDigit(n);
        }
        return n == 1;
    }

    private boolean isHappy3(int n) {
        int slow = n, fast = n;
        while (fast != 1) {
            slow = sumSquareDigit(slow);
            fast = sumSquareDigit(sumSquareDigit(fast));
            if (slow == fast) {
                return false;
            }
        }
        return true;
    }
}
