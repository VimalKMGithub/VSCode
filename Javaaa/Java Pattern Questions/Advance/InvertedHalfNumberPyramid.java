package Advance;

public class InvertedHalfNumberPyramid {
    public void print(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j <= height - i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int height = 5;
        InvertedHalfNumberPyramid sol = new InvertedHalfNumberPyramid();
        sol.print(height);
    }
}
