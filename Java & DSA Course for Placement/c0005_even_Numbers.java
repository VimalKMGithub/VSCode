import java.util.Scanner;

public class c0005_even_Numbers {
    public static void main(String[] args) {
        System.out.print("Enter a natural number : ");
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        sc.close();
        if (r1 >= 1) {
            System.out.print("Even integers from 1 to " + r1 + " : ");
            for (int i = 1; i <= r1; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + ", ");
                }
            }
        } else {
            System.out.println("Invalid Input");
        }
    }
}
