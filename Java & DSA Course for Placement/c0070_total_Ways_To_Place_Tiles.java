import java.util.Scanner;

public class c0070_total_Ways_To_Place_Tiles {
    static int c(int r, int c) {
        if (r < c) {
            return 1;
        }
        if (r == c) {
            return 2;
        }
        return c(r - 1, c) + c(r - c, c);
    }

    public static void main(String[] args) {
        System.out.print("Enter number of rows in matrix (natural number) : ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        System.out.print("Enter number of columns in matrix (natural number) : ");
        int c = sc.nextInt();
        sc.close();
        if (r >= 1 && c >= 1) {
            System.out.print("Total paths : " + c(r, c));
        } else {
            System.out.println("Invalid Input");
        }
    }
}
