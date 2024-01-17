import java.util.Scanner;

public class c0060_tower_Of_Hanoi {
    static void c(int n, char s, char h, char d) {
        if (n == 1) {
            System.out.println("Move disk '" + n + "' from '" + s + "' to '" + d + "'");
            return;
        }
        c(n - 1, s, d, h);
        System.out.println("Move disk '" + n + "' from '" + s + "' to '" + d + "'");
        c(n - 1, h, s, d);
    }

    public static void main(String[] args) {
        System.out.print("Enter number of disks (natural number) : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if (n >= 1) {
            c(n, 'S', 'H', 'D');
        } else {
            System.out.println("Invalid Input");
        }
    }
}
