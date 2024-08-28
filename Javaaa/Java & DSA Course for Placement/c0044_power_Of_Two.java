import java.util.Scanner;

public class c0044_power_Of_Two {
    static void c(int n) {
        if ((n & (n - 1)) == 0) {
            System.out.println(n + " is in power to 2");
            System.out.println("Since 2^" + (int) (Math.log(n) / Math.log(2)) + " = " + n);
        } else {
            System.out.println(n + " is not in power to 2");
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter a natural number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if (n >= 1) {
            c(n);
        } else {
            System.out.println("Invalid Input");
        }
    }
}
