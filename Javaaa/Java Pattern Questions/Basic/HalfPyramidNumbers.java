package Basic;

public class HalfPyramidNumbers {
    public void print(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int height = 5;
        HalfPyramidNumbers sol = new HalfPyramidNumbers();
        sol.print(height);
    }
}