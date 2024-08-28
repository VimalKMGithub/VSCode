import java.util.Scanner;

public class c0015_flyod_Triangle {
    public static void main(String[] args) {
        System.out.print("Enter height of triangle (natural number) : ");
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        sc.close();
        if (r1 >= 1) {
            int n = 1;
            System.out.println("Flyod triangle");
            for (int i = 1; i <= r1; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" " + n++);
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid Input");
        }
    }
}
