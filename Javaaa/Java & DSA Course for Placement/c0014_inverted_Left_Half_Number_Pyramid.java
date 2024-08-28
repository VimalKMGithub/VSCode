import java.util.Scanner;

public class c0014_inverted_Left_Half_Number_Pyramid {
    public static void main(String[] args) {
        System.out.print("Enter height of pyramid (natural number) : ");
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        sc.close();
        if (r1 >= 1) {
            System.out.println("Inverted left half number pyramid");
            for (int i = r1; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" " + j);
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid Input");
        }
    }
}
