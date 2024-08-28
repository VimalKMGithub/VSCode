import java.util.Scanner;

public class c0007_prime_Numbers {
    public static void main(String[] args) {
        System.out.print("Enter a natural number : ");
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        sc.close();
        if (r1 >= 1) {
            boolean pr = true;
            for (int i = 2; i <= (int) (r1 / 2); i++) {
                if (r1 % i == 0) {
                    pr = false;
                    break;
                }
            }
            if (pr) {
                System.out.println(r1 + " is a prime number");
            } else {
                System.out.println(r1 + " is not a prime number");
            }
        } else {
            System.out.println("Invalid Input");
        }
    }
}
