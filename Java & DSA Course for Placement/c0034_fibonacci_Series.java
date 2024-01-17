import java.util.Scanner;

public class c0034_fibonacci_Series {
    static void c(int n) {
        if (n == 1) {
            System.out.println("0,");
        } else {
            System.out.print("0, 1, ");
            int a = 0, b = 1, temp;
            for (int i = 3; i <= n; i++) {
                temp = b;
                b = a + b;
                a = temp;
                System.out.print(b + ", ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter how many terms of fibonacci series you want to print (natural number) : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if (n >= 1) {
            System.out.print("Fibonacci series : ");
            c(n);
        } else {
            System.out.println("Invalid Input");
        }
    }
}
