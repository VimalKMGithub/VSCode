import java.util.Scanner;

public class c0006_marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n;
        do {
            System.out.print("Enter marks (positive real number) : ");
            n = sc.nextDouble();
            if (n >= 90 && n <= 100) {
                System.out.println("Excellent! marks");
            } else if (n >= 60 && n <= 89) {
                System.out.println("Very good! marks");
            } else if (n >= 0 && n <= 59) {
                System.out.println("Good! marks");
            } else {
                System.out.println("Invalid Input");
            }
            System.out.print("Press 1 to continue or 0 to stop : ");
            n = sc.nextDouble();
        } while (n == 1);
        sc.close();
    }
}
