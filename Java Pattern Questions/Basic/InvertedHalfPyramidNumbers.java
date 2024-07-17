package Basic;

public class InvertedHalfPyramidNumbers {
    public void print(int height) {
        for (int i = height; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int height = 5;
        InvertedHalfPyramidNumbers sol = new InvertedHalfPyramidNumbers();
        sol.print(height);
    }
}