package JavaPatternsQuestions.Basic;

public class Q04InverseQ04 {
    public void printInverseQ04(int height) {
        for (int i = height; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q04InverseQ04 sol = new Q04InverseQ04();
        sol.printInverseQ04(5);
    }
}
