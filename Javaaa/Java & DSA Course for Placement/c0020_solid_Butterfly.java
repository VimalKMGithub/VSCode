import java.util.Scanner;

public class c0020_solid_Butterfly {
    public static void main(String[] args) {
        System.out.print("Enter half the height of butterfly wing (natural number) : ");
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        sc.close();
        if (r1 >= 1) {
            System.out.println("Solid butterfly");
            for (int i = 1; i <= r1; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" *");
                }
                for (int j = 1; j <= 2 * (r1 - i); j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print(" *");
                }
                System.out.println();
            }
            for (int i = r1; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" *");
                }
                for (int j = 1; j <= 2 * (r1 - i); j++) {
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
