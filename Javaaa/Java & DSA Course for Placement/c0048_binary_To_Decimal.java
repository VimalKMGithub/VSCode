import java.util.Scanner;

public class c0048_binary_To_Decimal {
    static int c(long n) {
        int a = 0, b = 1;
        while (n > 0) {
            a += (int) (n % 10) * b;
            n /= 10;
            b *= 2;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.print("Enter a binary representation of a number : ");
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        System.out.print("Decimal representation of " + n + " : " + c(n));
    }
}
