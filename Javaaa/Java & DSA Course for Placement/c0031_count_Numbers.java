import java.util.Scanner;

public class c0031_count_Numbers {
    static void c() {
        Scanner sc = new Scanner(System.in);
        double i;
        int p = 0, n = 0, z = 0;
        do {
            System.out.print("Enter a number (real number) : ");
            i = sc.nextInt();
            if (i == 0) {
                z++;
            } else if (i > 0) {
                p++;
            } else {
                n++;
            }
            System.out.print("Press 1 to continue or 0 to stop : ");
            i = sc.nextInt();
        } while (i == 1);
        sc.close();
        System.out.println("Total positive numbers entered : " + p + "\nTotal negative numbers entered : " + n
                + "\nTotal zeros entered : " + z);
    }

    public static void main(String[] args) {
        System.out.println("This program counts number of positive, negative & zero entered by user");
        c();
    }
}
