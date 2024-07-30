package JavaPatternsQuestions.Basic;

public class Q09RightHalfNumberPyra {
    public void printRightHalfNumberPyramid(int height) {
        for (int i = 1; i <= height; i++) {
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
        Q09RightHalfNumberPyra sol = new Q09RightHalfNumberPyra();
        sol.printRightHalfNumberPyramid(5);
    }
}
