import java.util.Scanner;

public class c0052_print_N_To_1_Using_Recursion {
    static String c(int n) {
        if (n == 1) {
            return "1";
        }
        return n + ", " + c(n - 1);
    }

    public static void main(String[] args) {
        System.out.print("Enter a natural number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if (n >= 1) {
            System.out.println("Natural numbers from " + n + " to 1 : " + c(n));
        } else {
            System.out.println("Invalid Input");
        }
    }
}
