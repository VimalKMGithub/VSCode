package JavaPatternsQuestions.Basic;

public class Q06InverseQ05 {
    public void printInverseQ05(int height) {
        for (int i = height; i >= 1; i--) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q06InverseQ05 sol = new Q06InverseQ05();
        sol.printInverseQ05(5);
    }
}
