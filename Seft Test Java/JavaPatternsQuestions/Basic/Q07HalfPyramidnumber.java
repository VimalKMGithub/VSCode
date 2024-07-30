package JavaPatternsQuestions.Basic;

public class Q07HalfPyramidnumber {
    public void printHalfPyramidnumber(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q07HalfPyramidnumber sol = new Q07HalfPyramidnumber();
        sol.printHalfPyramidnumber(5);
    }
}
