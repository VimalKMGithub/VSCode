package JavaPatternsQuestions.Basic;

public class Q18PalindromeNumberPyra {
    public void printPalindromeNumberPyra(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q18PalindromeNumberPyra sol = new Q18PalindromeNumberPyra();
        sol.printPalindromeNumberPyra(5);
    }
}
