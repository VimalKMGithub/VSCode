import java.util.Scanner;

public class c0071_total_Ways_To_Call_Guest {
    static int c(int r) {
        if (r <= 1) {
            return 1;
        }
        return c(r - 1) + (r - 1) * c(r - 2);
    }

    public static void main(String[] args) {
        System.out.print("Enter number of guests (natural number) : ");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        sc.close();
        if (r >= 1) {
            System.out.print("Total paths : " + c(r));
        } else {
            System.out.println("Invalid Input");
        }
    }
}
