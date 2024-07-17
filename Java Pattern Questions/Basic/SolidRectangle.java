package Basic;

public class SolidRectangle {
    public void print(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int rows = 4;
        int cols = 5;
        SolidRectangle sol = new SolidRectangle();
        sol.print(rows, cols);
    }
}