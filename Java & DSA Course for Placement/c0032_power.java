import java.util.Scanner;

public class c0032_power {
    static double c(double n, double p) {
        return Math.pow(n, p);
    }

    public static void main(String[] args) {
        System.out.print("Enter number (real number) : ");
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        System.out.print("Enter power (real number) : ");
        double p = sc.nextDouble();
        sc.close();
        System.out.println(n + "^" + p + " : " + c(n, p));
    }
}
