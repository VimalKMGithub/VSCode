package JavaPatternsQuestions.Basic;

public class Q15SolidSquare {
    public void printSolidSquare(int side) {
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q15SolidSquare sol = new Q15SolidSquare();
        sol.printSolidSquare(5);
    }
}
