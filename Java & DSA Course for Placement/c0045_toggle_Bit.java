import java.util.Scanner;

public class c0045_toggle_Bit {
    static int c(int n, int p) {
        if (((1 << p) & n) == 0) {
            return (1 << p) | n;
        } else {
            return ~(1 << p) & n;
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter an integer : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter the position of bit you want to toggle (natural number (1 - 32) ) : ");
        int p = sc.nextInt() - 1;
        sc.close();
        if (p >= 0 && p <= 31) {
            System.out.println("After toggling bit at " + (p + 1) + ", " + n + " becomes : " + c(n, p));
        } else {
            System.out.println("Invalid Input");
        }
    }
}
