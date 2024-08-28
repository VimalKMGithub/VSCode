package Basic;

public class PalindromeNumberPyramid {
    public void print(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int height = 5;
        PalindromeNumberPyramid sol = new PalindromeNumberPyramid();
        sol.print(height);
    }
}