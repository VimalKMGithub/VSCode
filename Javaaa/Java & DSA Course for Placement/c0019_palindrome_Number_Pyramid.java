import java.util.Scanner;

public class c0019_palindrome_Number_Pyramid {
    public static void main(String[] args) {
        System.out.print("Enter height of pyramid (natural number) : ");
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        sc.close();
        if (r1 >= 1) {
            System.out.println("Palindrome number pyramid");
            for (int i = 1; i <= r1; i++) {
                for (int j = 1; j <= (r1 - i); j++) {
                    System.out.print("  ");
                }
                for (int j = i; j >= 1; j--) {
                    System.out.print(" " + j);
                }
                for (int j = 2; j <= i; j++) {
                    System.out.print(" " + j);
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid Input");
        }
    }
}
