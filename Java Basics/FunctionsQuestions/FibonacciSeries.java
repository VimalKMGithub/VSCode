package FunctionsQuestions;

public class FibonacciSeries {
    public void printFibonacciUptoN(int n) {
        int firstNum = 0;
        int secondNum = 1;
        if (n == 1) {
            System.out.println(firstNum);
        } else {
            System.out.print(firstNum + " ");
            for (int i = 2; i <= n; i++) {
                System.out.print(secondNum + " ");
                int temp = secondNum;
                secondNum = firstNum + secondNum;
                firstNum = temp;
            }
        }
    }

    public int giveNthFibonacci(int n) {
        int firstNum = 0;
        int secondNum = 1;
        if (n == 1) {
            return firstNum;
        } else if (n == 2) {
            return secondNum;
        } else {
            for (int i = 3; i <= n; i++) {
                int temp = secondNum;
                secondNum = firstNum + secondNum;
                firstNum = temp;
            }
        }
        return secondNum;
    }

    public static void main(String[] args) {
        FibonacciSeries fb = new FibonacciSeries();
        fb.printFibonacciUptoN(6);
        System.out.println();
        System.out.println(fb.giveNthFibonacci(6));
    }
}
