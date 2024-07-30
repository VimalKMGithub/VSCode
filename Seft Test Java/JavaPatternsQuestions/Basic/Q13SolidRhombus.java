package JavaPatternsQuestions.Basic;

public class Q13SolidRhombus {
    public void printSolidRhombus(int side) {
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= side; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q13SolidRhombus sol = new Q13SolidRhombus();
        sol.printSolidRhombus(5);
    }
}
