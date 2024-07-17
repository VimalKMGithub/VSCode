// Time Complexity: O(n)
// Space Complexity: O(n)
// power of 2 using recursion
public class n0005_power_of_2 {
    private double powerOfTwo(int n) {
        if (n >= 0) {
            return positivePowerOfTwo(n);
        } else {
            return 1 / positivePowerOfTwo(-n);
        }
    }

    private double positivePowerOfTwo(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("This function only supports positive poers");
        }
        if (n == 0) {
            return 1;
        }
        return positivePowerOfTwo(n - 1) * 2;
    }
}