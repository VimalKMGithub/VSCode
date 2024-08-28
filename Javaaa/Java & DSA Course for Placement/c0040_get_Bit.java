import java.util.Scanner;

public class c0040_get_Bit {
    static int c(int n, int p) {
        if (((1 << p) & n) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter an integer : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter the position you want to know bit at (natural number (1 - 32) ) : ");
        int p = sc.nextInt() - 1;
        sc.close();
        if (p >= 0 && p <= 31) {
            System.out.println("Bit at " + (p + 1) + " of " + n + " : " + c(n, p));
        } else {
            System.out.println("Invalid Input");
        }
    }
}
