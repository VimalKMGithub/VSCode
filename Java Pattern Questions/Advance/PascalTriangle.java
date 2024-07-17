package Advance;

public class PascalTriangle {
    public void print(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(combination(i - 1, j - 1) + " ");
            }
            System.out.println();
        }
    }

    private int factorial(int n) {
        int result;
        for (result = 1; n > 1; n--) {
            result *= n;
        }
        return result;
    }

    private int combination(int n, int r) {
        return (factorial(n) / (factorial(r) * factorial(n - r)));
    }

    public static void main(String[] args) {
        int height = 5;
        PascalTriangle sol = new PascalTriangle();
        sol.print(height);
    }
}