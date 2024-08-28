package IntermediateQuestions;

public class XToPowerN {
    // Time: O(n), Space: O(n)
    public int xToPowerN(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * xToPowerN(x, n - 1);
    }

    // Time: O(n), Space: O(log n base 2)
    public int xToPowerNSpaceLogNBase2(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return xToPowerNSpaceLogNBase2(x, n / 2) * xToPowerNSpaceLogNBase2(x, n / 2);
        } else {
            return x * xToPowerNSpaceLogNBase2(x, n / 2) * xToPowerNSpaceLogNBase2(x, n / 2);
        }
    }

    // Similarly we can create more
    // Time: O(n), Space: O(log n base 3)
    public int xToPowerNSpaceLogNBase3(int x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n % 3 == 0) {
            return xToPowerNSpaceLogNBase3(x, n / 3) * xToPowerNSpaceLogNBase3(x, n / 3)
                    * xToPowerNSpaceLogNBase3(x, n / 3);
        } else if (n % 3 == 1) {
            return x * xToPowerNSpaceLogNBase3(x, n / 3) * xToPowerNSpaceLogNBase3(x, n / 3)
                    * xToPowerNSpaceLogNBase3(x, n / 3);
        } else {
            return x * x * xToPowerNSpaceLogNBase3(x, n / 3) * xToPowerNSpaceLogNBase3(x, n / 3)
                    * xToPowerNSpaceLogNBase3(x, n / 3);
        }
    }

    public static void main(String[] args) {
        XToPowerN sol = new XToPowerN();
        System.out.println(sol.xToPowerN(5, 5));
        System.out.println(sol.xToPowerNSpaceLogNBase2(5, 5));

        System.out.println(sol.xToPowerNSpaceLogNBase3(5, 5));
    }
}