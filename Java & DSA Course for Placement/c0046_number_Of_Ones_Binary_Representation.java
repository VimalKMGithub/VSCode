import java.util.Scanner;

public class c0046_number_Of_Ones_Binary_Representation {
    static int c(int n) {
        int a = 0;
        while (n > 0) {
            a += n & 1;
            n >>= 1;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.print("Enter a whole number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        if (n >= 0) {
            System.out.println("Number of set bits in binary representation of " + n + " : " + c(n));
        } else {
            System.out.println("Invalid Input");
        }
    }
}
