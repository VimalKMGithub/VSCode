import java.util.Scanner;

public class c0012_right_Half_Pyramid {
    public static void main(String[] args) {
        System.out.print("Enter height of pyramid (natural number) : ");
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        sc.close();
        if (r1 >= 1) {
            System.out.println("Right half pyramid");
            for (int i = 1; i <= r1; i++) {
                for (int j = i; j <= (r1 - 1); j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(" *");
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid Input");
        }
    }
}
