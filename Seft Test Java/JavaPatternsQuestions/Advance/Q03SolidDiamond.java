package JavaPatternsQuestions.Advance;

public class Q03SolidDiamond {
    public void printSolidDiamond(int halfHeight) {
        for (int i = 1; i <= halfHeight; i++) {
            for (int j = 1; j <= halfHeight - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = halfHeight; i >= 1; i--) {
            for (int j = 1; j <= halfHeight - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q03SolidDiamond sol = new Q03SolidDiamond();
        sol.printSolidDiamond(5);
    }
}
