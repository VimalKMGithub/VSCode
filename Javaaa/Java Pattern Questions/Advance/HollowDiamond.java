package Advance;

public class HollowDiamond {
    public void print(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print("  ");
            }
            System.out.print("* ");
            for (int j = 1; j <= 2 * i - 3; j++) {
                System.out.print("  ");
            }
            if (i > 1) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = height; i >= 1; i--) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print("  ");
            }
            System.out.print("* ");
            for (int j = 1; j <= 2 * i - 3; j++) {
                System.out.print("  ");
            }
            if (i > 1) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int height = 5;
        HollowDiamond sol = new HollowDiamond();
        sol.print(height);
    }
}