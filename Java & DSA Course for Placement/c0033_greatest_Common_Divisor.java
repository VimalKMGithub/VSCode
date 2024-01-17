import java.util.Scanner;

public class c0033_greatest_Common_Divisor {
    static int c(int n, int p) {
        while (n != p) {
            if (n > p) {
                n -= p;
            } else {
                p -= n;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.print("Enter first natural number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter second natural number : ");
        int p = sc.nextInt();
        sc.close();
        if (n >= 1 && p >= 1) {
            System.out.println("Greatest common divisor of " + n + " & " + p + " : " + c(n, p));
        } else {
            System.out.println("Invalid Input");
        }
    }
}
