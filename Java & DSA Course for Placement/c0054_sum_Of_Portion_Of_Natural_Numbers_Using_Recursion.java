import java.util.Scanner;

public class c0054_sum_Of_Portion_Of_Natural_Numbers_Using_Recursion {
    static int c(int m, int n) {
        if (n == m) {
            return m;
        }
        return m + c(m + 1, n);
    }

    public static void main(String[] args) {
        System.out.print("Enter first natural number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter second natural number : ");
        int m = sc.nextInt();
        sc.close();
        if (n >= 1 && m >= 1) {
            if (n > m) {
                System.out.println("Sum of natural numbers from " + m + " to " + n + " : " + c(m, n));
            } else {
                System.out.println("Sum of natural numbers from " + n + " to " + m + " : " + c(n, m));
            }
        } else {
            System.out.println("Invalid Input");
        }
    }
}
