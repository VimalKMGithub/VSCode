package JavaPatternsQuestions.Basic;

public class Q16HallowSquare {
    public void printHallowSquare(int side) {
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++) {
                if (i == 1 || i == side || j == 1 || j == side) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q16HallowSquare sol = new Q16HallowSquare();
        sol.printHallowSquare(5);
    }
}
