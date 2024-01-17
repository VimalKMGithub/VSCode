import java.util.Scanner;

public class c0026_factorial_Function {
    static int f(int n) {
        int r;
        for (r = 1; n > 1; n--) {
            r *= n;
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.print("Enter a whole number : ");
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        sc.close();
        if (r1 >= 0) {
            System.out.println("Factorial of " + r1 + " : " + f(r1));
        } else {
            System.out.println("Invalid Input");
        }
    }
}
