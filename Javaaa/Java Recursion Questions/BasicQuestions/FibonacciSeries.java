package BasicQuestions;

public class FibonacciSeries {
    public void printFibonacci(int n) {
        printFibonacci(0, 1, n);
    }

    private void printFibonacci(int a, int b, int n) {
        if (n == 1) {
            System.out.println(a);
            return;
        }
        System.out.print(a + " ");
        printFibonacci(b, a + b, n - 1);
    }

    public int nthFibonacci(int n) {
        return nthFibonacci(0, 1, n);
    }

    private int nthFibonacci(int a, int b, int n) {
        if (n == 1) {
            return a;
        }
        return nthFibonacci(b, a + b, n - 1);
    }

    public static void main(String[] args) {
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        fibonacciSeries.printFibonacci(5);
        System.out.println(fibonacciSeries.nthFibonacci(5));
    }
}