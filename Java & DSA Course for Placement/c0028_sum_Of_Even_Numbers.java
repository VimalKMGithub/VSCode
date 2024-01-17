import java.util.Scanner;

public class c0028_sum_Of_Even_Numbers {
    static int s(int n) {
        int r;
        for (r = 0; n >= 2; n--) {
            if (n % 2 == 0) {
                r += n;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.print("Enter a natural number : ");
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        sc.close();
        if (r1 >= 1) {
            System.out.println("Sum of even numbers from 1 to " + r1 + " : " + s(r1));
        } else {
            System.out.println("Invalid Input");
        }
    }
}
