package JavaPatternsQuestions.Basic;

public class Q03HalfPyramid {
    public void printHalfPyramid(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q03HalfPyramid sol = new Q03HalfPyramid();
        sol.printHalfPyramid(5);
    }
}
