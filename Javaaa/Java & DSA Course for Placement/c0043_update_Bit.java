import java.util.Scanner;

public class c0043_update_Bit {
    static int c(int n, int p, int o) {
        if (o == 1) {
            return (1 << p) | n;
        } else {
            return ~(1 << p) & n;
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter an integer : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter the position you want to update bit (natural number (1 - 32) ) : ");
        int p = sc.nextInt() - 1;
        System.out.print("Change bit to '0' or '1' : ");
        int o = sc.nextInt();
        sc.close();
        if (p >= 0 && p <= 31) {
            System.out.println(
                    "After setting bit at position " + (p + 1) + " to " + o + ", " + n + " becomes : " + c(n, p, o));
        } else {
            System.out.println("Invalid Input");
        }
    }
}
