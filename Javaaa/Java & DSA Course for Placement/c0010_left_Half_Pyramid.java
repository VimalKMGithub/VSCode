import java.util.Scanner;

public class c0010_left_Half_Pyramid {
    public static void main(String[] args) {
        System.out.print("Enter height of pyramid (natural number) : ");
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        sc.close();
        if (r1 >= 1) {
            System.out.println("Left half pyramid");
            for (int i = 1; i <= r1; i++) {
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
