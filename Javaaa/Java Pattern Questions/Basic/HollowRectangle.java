package Basic;

public class HollowRectangle {
    public void print(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || j == 1 || i == rows || j == cols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 4;
        int cols = 5;
        HollowRectangle sol = new HollowRectangle();
        sol.print(rows, cols);
    }
}