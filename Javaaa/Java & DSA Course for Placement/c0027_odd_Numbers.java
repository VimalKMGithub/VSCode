import java.util.Scanner;

public class c0027_odd_Numbers {
    static void s(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter a natural number : ");
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        sc.close();
        if (r1 >= 1) {
            System.out.print("All odd numbers from 1 to " + r1 + " : ");
            s(r1);
        } else {
            System.out.println("Invalid Input");
        }
    }
}
