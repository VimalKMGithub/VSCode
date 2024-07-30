package JavaPatternsQuestions.Basic;

public class Q08InverseQ07 {
    public void printInverseQ07(int height) {
        for (int i = height; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q08InverseQ07 sol = new Q08InverseQ07();
        sol.printInverseQ07(5);
    }
}
