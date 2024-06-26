// Time Complexity: O(n)
// Space Complexity: O(n)
// power of a using recursion
public class n0006_a_power_b {
    private double aToPowerB(int a, int b) {
        if (b >= 0) {
            return positiveAToPowerB(a, b);
        } else {
            return 1 / positiveAToPowerB(a, -b);
        }
    }

    private double positiveAToPowerB(int a, int b) {
        if (b < 0) {
            throw new IllegalArgumentException("This function only supports positive poers");
        }
        if (b == 0) {
            return 1;
        }
        return positiveAToPowerB(a, b - 1) * a;
    }
}
