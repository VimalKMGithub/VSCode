import java.util.Scanner;

public class c0003_simple_Calculator {
    public static void main(String[] args) {
        System.out.print("Enter first number (real number) : ");
        Scanner sc = new Scanner(System.in);
        double r1 = sc.nextDouble();
        System.out.print("Enter second number (real number) : ");
        double r2 = sc.nextDouble();
        System.out.print("Enter operation (+, -, *, /, %) : ");
        char op = sc.next().charAt(0);
        sc.close();
        switch (op) {
            case '+':
                System.out.println(r1 + " + " + r2 + " = " + (r1 + r2));
                break;
            case '-':
                System.out.println(r1 + " - " + r2 + " = " + (r1 - r2));
                break;
            case '*':
                System.out.println(r1 + " * " + r2 + " = " + (r1 * r2));
                break;
            case '/':
                if (r2 != 0) {
                    System.out.println(r1 + " / " + r2 + " = " + (r1 / r2));
                } else {
                    System.out.println("Can't divide by 0");
                }
                break;
            case '%':
                if (r2 != 0) {
                    System.out.println(r1 + " % " + r2 + " = " + (r1 % r2));
                } else {
                    System.out.println("Can't divide by 0");
                }
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }
}
