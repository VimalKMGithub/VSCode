import java.util.Scanner;

public class c0047_decimal_To_Binary {
    static void c(int n) {
        for (int i = 31; i >= 0; i--) {
            if (((n >> i) & 1) == 1) {
                System.out.print(1);
            } else {
                System.out.print(0);
            }
            if (i % 4 == 0) {
                System.out.print(" ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter an integer : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.print("Binary representation of " + n + " in 32 bits : ");
        c(n);
    }
}
