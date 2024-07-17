package Basic;

public class InvertedHalfPyramidRightSide {
    public void print(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int height = 5;
        InvertedHalfPyramidRightSide sol = new InvertedHalfPyramidRightSide();
        sol.print(height);
    }
}