import java.util.Scanner;

public class c0024_hallow_Rhombus {
    public static void main(String[] args) {
        System.out.print("Enter length of side of rhombus (natural number) : ");
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        sc.close();
        if (r1 >= 1) {
            System.out.println("Hallow rhombus");
            for (int i = 1; i <= r1; i++) {
                for (int j = i; j <= r1; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= r1; j++) {
                    if (i == 1 || j == 1 || i == r1 || j == r1) {
                        System.out.print(" *");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid Input");
        }
    }
}
