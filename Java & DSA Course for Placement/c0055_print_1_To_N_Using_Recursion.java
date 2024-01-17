import java.util.Scanner;

public class c0055_print_1_To_N_Using_Recursion {
    static String c(int m, int n) {
        if (n == m) {
            return "" + m;
        }
        return m + ", " + c(m + 1, n);
    }

    public static void main(String[] args) {
        System.out.print("Enter a natural number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if (n >= 1) {
            System.out.println("Natural numbers from 1 to " + n + " : " + c(1, n));
        } else {
            System.out.println("Invalid Input");
        }
    }
}
