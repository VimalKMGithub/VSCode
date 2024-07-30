package JavaPatternsQuestions.Basic;

public class Q17NumberPyramid {
    public void printNumberPyramid(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q17NumberPyramid sol = new Q17NumberPyramid();
        sol.printNumberPyramid(5);
    }
}
