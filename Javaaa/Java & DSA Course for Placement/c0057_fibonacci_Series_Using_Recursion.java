import java.util.Scanner;

public class c0057_fibonacci_Series_Using_Recursion {
    static String c(int a, int b, int n) {
        if (n == 1) {
            return "" + a;
        }
        return a + ", " + c(b, a + b, n - 1);
    }

    public static void main(String[] args) {
        System.out.print("Enter how many terms of fibonacci series you want to print (natural number) : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if (n >= 1) {
            System.out.println(c(0, 1, n));
        } else {
            System.out.println("Invalid Input");
        }
    }
}
