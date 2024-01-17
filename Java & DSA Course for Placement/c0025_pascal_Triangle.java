import java.util.Scanner;

public class c0025_pascal_Triangle {
    static int f(int n) {
        int r;
        for (r = 1; n > 1; n--) {
            r *= n;
        }
        return r;
    }

    static int c(int n, int r) {
        return (f(n) / (f(r) * f(n - r)));
    }

    public static void main(String[] args) {
        System.out.print("Enter height of triangle (natural number) : ");
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt() - 1;
        sc.close();
        if (r1 >= 1) {
            System.out.println("Pascal triangle");
            for (int i = 0; i <= r1; i++) {
                for (int j = 0; j <= (r1 - i); j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print(" " + c(i, j));
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid Input");
        }
    }
}
