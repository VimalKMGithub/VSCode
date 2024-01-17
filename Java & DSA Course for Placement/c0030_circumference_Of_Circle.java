import java.util.Scanner;

public class c0030_circumference_Of_Circle {
    static double s(double n) {
        return 2 * 3.141592653589 * n;
    }

    public static void main(String[] args) {
        System.out.print("Enter radius (positive real number) : ");
        Scanner sc = new Scanner(System.in);
        double r1 = sc.nextInt();
        sc.close();
        if (r1 > 0) {
            System.out.println("Circumference of circle : " + s(r1));
        } else {
            System.out.println("Invalid Input");
        }
    }
}
