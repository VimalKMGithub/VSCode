package Basic;

public class InvertedHalfPyramid {
    public void print(int height) {
        for (int i = height; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int height = 5;
        InvertedHalfPyramid sol = new InvertedHalfPyramid();
        sol.print(height);
    }
}