package JavaPatternsQuestions.Basic;

public class Q10InverseQ09 {
    public void printInverseQ09(int height) {
        for (int i = height; i >= 1; i--) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q10InverseQ09 sol = new Q10InverseQ09();
        sol.printInverseQ09(5);
    }
}
