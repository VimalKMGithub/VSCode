package JavaPatternsQuestions.Basic;

public class Q05RightHalfPyramid {
    public void printRightHalfPyramid(int height) {
        for (int i = 1; i <= height; i++) {
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
        Q05RightHalfPyramid sol = new Q05RightHalfPyramid();
        sol.printRightHalfPyramid(5);
    }
}
