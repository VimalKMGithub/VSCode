package JavaPatternsQuestions.Basic;

public class Q14HallowRhombus {
    public void printHallowRhombus(int side) {
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side - i; j++) {
                System.out.print("  ");
            }
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
        Q14HallowRhombus sol = new Q14HallowRhombus();
        sol.printHallowRhombus(5);
    }
}
