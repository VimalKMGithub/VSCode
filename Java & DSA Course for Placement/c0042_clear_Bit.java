import java.util.Scanner;

public class c0042_clear_Bit {
    static int c(int n, int p) {
        return ~(1 << p) & n;
    }

    public static void main(String[] args) {
        System.out.print("Enter an integer : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter the position you want to set bit to 0 (natural number (1 - 32) ) : ");
        int p = sc.nextInt() - 1;
        sc.close();
        if (p >= 0 && p <= 31) {
            System.out.println("After setting bit at position " + (p + 1) + " to 0, " + n + " becomes : " + c(n, p));
        } else {
            System.out.println("Invalid Input");
        }
    }
}
