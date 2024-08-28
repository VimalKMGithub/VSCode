package Basic;

public class HalfPyramid {
    public void print(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int height = 5;
        HalfPyramid sol = new HalfPyramid();
        sol.print(height);
    }
}