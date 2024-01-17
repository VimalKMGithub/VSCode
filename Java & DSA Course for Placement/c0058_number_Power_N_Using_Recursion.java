import java.util.Scanner;

public class c0058_number_Power_N_Using_Recursion {
    static double c(double n, int p) {
        if (p == 0 || n == 1) {
            return 1;
        }
        if (n == 0) {
            return 0;
        }
        return n * c(n, p - 1);
    }

    public static void main(String[] args) {
        System.out.print("Enter a real number : ");
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        System.out.print("Enter power (integer) : ");
        int p = sc.nextInt();
        sc.close();
        if (p >= 0) {
            System.out.println("(" + n + ")^(" + p + ") : " + c(n, p));
        } else {
            System.out.println("(" + n + ")^(" + p + ") : " + 1 / c(n, Math.abs(p)));
        }
    }
}
