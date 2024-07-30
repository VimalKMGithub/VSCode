package JavaPatternsQuestions.Advance;

public class Q02HallowButterFly {
    public void printHallowButterFly(int halfHeight) {
        for (int i = 1; i <= halfHeight; i++) {
            System.out.print("* ");
            for (int j = 1; j <= i - 2; j++) {
                System.out.print("  ");
            }
            if (i > 1) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2 * (halfHeight - i); j++) {
                System.out.print("  ");
            }
            System.out.print("* ");
            for (int j = 1; j <= i - 2; j++) {
                System.out.print("  ");
            }
            if (i > 1) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = halfHeight; i >= 1; i--) {
            System.out.print("* ");
            for (int j = 1; j <= i - 2; j++) {
                System.out.print("  ");
            }
            if (i > 1) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2 * (halfHeight - i); j++) {
                System.out.print("  ");
            }
            System.out.print("* ");
            for (int j = 1; j <= i - 2; j++) {
                System.out.print("  ");
            }
            if (i > 1) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q02HallowButterFly sol = new Q02HallowButterFly();
        sol.printHallowButterFly(6);
    }
}
