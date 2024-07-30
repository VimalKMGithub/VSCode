package JavaPatternsQuestions.Basic;

public class Q01SolidRectangle {
    public void printSolidRectangle(int length, int breadth) {
        for (int i = 1; i <= breadth; i++) {
            for (int j = 1; j <= length; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q01SolidRectangle sol = new Q01SolidRectangle();
        sol.printSolidRectangle(5, 4);
    }
}