import java.util.Scanner;

public class c0008_solid_Rectangle {
    public static void main(String[] args) {
        System.out.print("Enter length of rectangle (natural number) : ");
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        System.out.print("Enter breadth of rectangle (natural number) : ");
        int r2 = sc.nextInt();
        sc.close();
        if (r1 >= 1 && r2 >= 1) {
            System.out.println("Solid rectangle");
            for (int i = 1; i <= r2; i++) {
                for (int j = 1; j <= r1; j++) {
                    System.out.print(" *");
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid Input");
        }
    }
}
