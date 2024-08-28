import java.util.Scanner;

public class c0001_area_Of_Circle {
    public static void main(String[] args) {
        System.out.print("Enter radius of circle (positive real number) : ");
        Scanner sc = new Scanner(System.in);
        double r1 = sc.nextDouble();
        sc.close();
        if (r1 > 0) {
            System.out.println("Area : " + (3.141592653589 * r1 * r1));
        } else {
            System.out.println("Invalid Input");
        }
    }
}
