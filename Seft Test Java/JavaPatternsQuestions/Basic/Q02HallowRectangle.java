package JavaPatternsQuestions.Basic;

public class Q02HallowRectangle {
    public void printHallowRectangle(int length, int breadth) {
        for (int i = 1; i <= breadth; i++) {
            for (int j = 1; j <= length; j++) {
                if (i == 1 || i == breadth || j == 1 || j == length) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q02HallowRectangle sol = new Q02HallowRectangle();
        sol.printHallowRectangle(5, 4);
    }
}
