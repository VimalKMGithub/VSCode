package Advance;

public class HollowButterfly {
    public void print(int height) {
        for (int i = 1; i <= height; i++) {
            System.out.print("* ");
            if (i > 1) {
                for (int j = 1; j <= i - 2; j++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            for (int j = 1; j <= 2 * (height - i); j++) {
                System.out.print("  ");
            }
            System.out.print("* ");
            if (i > 1) {
                for (int j = 1; j <= i - 2; j++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = height; i >= 1; i--) {
            System.out.print("* ");
            if (i > 1) {
                for (int j = 1; j <= i - 2; j++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            for (int j = 1; j <= 2 * (height - i); j++) {
                System.out.print("  ");
            }
            System.out.print("* ");
            if (i > 1) {
                for (int j = 1; j <= i - 2; j++) {
                    System.out.print("  ");
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int height = 5;
        HollowButterfly sol = new HollowButterfly();
        sol.print(height);
    }
}