import java.util.Scanner;

public class c0023_hallow_Butterfly {
    public static void main(String[] args) {
        System.out.print("Enter half the height of butterfly wing (natural number) : ");
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        sc.close();
        if (r1 >= 1) {
            System.out.println("Hallow butterfly");
            for (int i = 1; i <= r1; i++) {
                System.out.print(" *");
                if (i >= 2) {
                    for (int j = 1; j <= i - 2; j++) {
                        System.out.print("  ");
                    }
                    System.out.print(" *");
                }
                for (int j = 1; j <= 2 * (r1 - i); j++) {
                    System.out.print("  ");
                }
                System.out.print(" *");
                if (i >= 2) {
                    for (int j = 1; j <= i - 2; j++) {
                        System.out.print("  ");
                    }
                    System.out.print(" *");
                }
                System.out.println();
            }
            for (int i = r1; i >= 1; i--) {
                System.out.print(" *");
                if (i >= 2) {
                    for (int j = 1; j <= i - 2; j++) {
                        System.out.print("  ");
                    }
                    System.out.print(" *");
                }
                for (int j = 1; j <= 2 * (r1 - i); j++) {
                    System.out.print("  ");
                }
                System.out.print(" *");
                if (i >= 2) {
                    for (int j = 1; j <= i - 2; j++) {
                        System.out.print("  ");
                    }
                    System.out.print(" *");
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid Input");
        }
    }
}
