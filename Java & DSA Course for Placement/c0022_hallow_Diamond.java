import java.util.Scanner;

public class c0022_hallow_Diamond {
    public static void main(String[] args) {
        System.out.print("Enter half the height of diamond (natural number) : ");
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        sc.close();
        if (r1 >= 1) {
            System.out.println("Hallow diamond");
            int s = 1;
            for (int i = 1; i <= r1; i++) {
                for (int j = 1; j <= (r1 - i); j++) {
                    System.out.print("  ");
                }
                System.out.print(" *");
                if (i >= 2) {
                    for (int j = 1; j <= s; j++) {
                        System.out.print("  ");
                    }
                    s += 2;
                    System.out.print(" *");
                }
                System.out.println();
            }
            for (int i = r1; i >= 1; i--) {
                for (int j = 1; j <= (r1 - i); j++) {
                    System.out.print("  ");
                }
                System.out.print(" *");
                if (i >= 2) {
                    s -= 2;
                    for (int j = 1; j <= s; j++) {
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
