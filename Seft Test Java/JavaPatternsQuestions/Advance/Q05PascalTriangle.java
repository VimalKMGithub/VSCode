package JavaPatternsQuestions.Advance;

public class Q05PascalTriangle {
    public void printPascalTrinagle(int height) {
        int[][] triangle = new int[height][height];
        for (int i = 0; i < height; i++) {
            for (int j = 1; j < height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (i == j || j == 0) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }

    private int combination(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    private int factorial(int n) {
        int result;
        for (result = 1; n > 1; n--) {
            result *= n;
        }
        return result;
    }

    public void printPascalTrinagle2(int height) {
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

    public static void main(String[] args) {
        Q05PascalTriangle sol = new Q05PascalTriangle();
        sol.printPascalTrinagle(5);
        sol.printPascalTrinagle2(5);
    }
}
