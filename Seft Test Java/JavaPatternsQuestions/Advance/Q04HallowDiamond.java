package JavaPatternsQuestions.Advance;

public class Q04HallowDiamond {
    public void printHallowDiamond(int halfHeight) {
        for (int i = 1; i <= halfHeight; i++) {
            for (int j = 1; j <= halfHeight - i; j++) {
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
        for (int i = halfHeight; i >= 1; i--) {
            for (int j = 1; j <= halfHeight - i; j++) {
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
        Q04HallowDiamond sol = new Q04HallowDiamond();
        sol.printHallowDiamond(5);
    }
}
