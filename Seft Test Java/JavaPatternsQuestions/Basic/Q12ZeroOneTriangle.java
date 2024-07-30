package JavaPatternsQuestions.Basic;

public class Q12ZeroOneTriangle {
    public void printZeroOneTriangle(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public void printZeroOneTriangle2(int height) {
        int flag = 1;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(flag + " ");
                if (flag == 1) {
                    flag = 0;
                } else {
                    flag = 1;
                }
            }
            System.out.println();
            if ((i & 1) == 1) {
                flag = 1;
            }
        }
    }

    public static void main(String[] args) {
        Q12ZeroOneTriangle sol = new Q12ZeroOneTriangle();
        sol.printZeroOneTriangle(5);
    }
}
