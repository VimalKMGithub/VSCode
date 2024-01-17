import java.util.Scanner;

public class c0002_table {
    public static void main(String[] args) {
        System.out.print("Enter an integer : ");
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        sc.close();
        System.out.println("Table of " + r1);
        for (int i = 1; i <= 10; i++) {
            System.out.println(r1 + " x " + i + " = " + (r1 * i));
        }
    }
}