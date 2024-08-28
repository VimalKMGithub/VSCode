import java.util.Scanner;

public class c0053_sum_Of_First_N_Natural_Number_Using_Recursion {
    static int c(int n) {
        if (n == 1) {
            return 1;
        }
        return n + c(n - 1);
    }

    public static void main(String[] args) {
        System.out.print("Enter a natural number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if (n >= 1) {
            System.out.println("Sum of natural numbers from 1 to " + n + " : " + c(n));
        } else {
            System.out.println("Invalid Input");
        }
    }
}
