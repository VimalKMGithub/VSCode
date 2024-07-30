package JavaPatternsQuestions.Basic;

public class Q11FloydTriangle {
    public void printFloydTriangle(int height) {
        int i = 1;
        for (int j = 1; j <= height; j++) {
            for (int j2 = 1; j2 <= j; j2++) {
                System.out.print(i++ + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q11FloydTriangle sol = new Q11FloydTriangle();
        sol.printFloydTriangle(5);
    }
}
