package Basic;

public class ZeroOneTriangle {
    public void print(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int height = 5;
        ZeroOneTriangle sol = new ZeroOneTriangle();
        sol.print(height);
    }
}