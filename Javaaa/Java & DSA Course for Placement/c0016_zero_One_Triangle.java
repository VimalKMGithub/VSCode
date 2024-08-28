import java.util.Scanner;

public class c0016_zero_One_Triangle {
    public static void main(String[] args) {
        System.out.print("Enter height of triangle (natural number) : ");
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        sc.close();
        if (r1 >= 1) {
            System.out.println("Zero one triangle");
            for (int i = 1; i <= r1; i++) {
                for (int j = 1; j <= i; j++) {
                    if ((i + j) % 2 == 0) {
                        System.out.print(" " + 1);
                    } else {
                        System.out.print(" " + 0);
                    }
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid Input");
        }
    }
}
