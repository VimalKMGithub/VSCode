import java.util.Scanner;

public class c0056_factorial_Using_Recursion {
    static int c(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * c(n - 1);
    }

    public static void main(String[] args) {
        System.out.print("Enter a whole number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if (n >= 0) {
            System.out.println("Factorial of " + n + " : " + c(n));
        } else {
            System.out.println("Invalid Input");
        }
    }
}
