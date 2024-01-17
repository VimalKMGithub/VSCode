import java.util.Scanner;

public class c0061_reverse_String_Using_Recursion {
    static String n;

    static String c(int l) {
        if (l == 0) {
            return "" + n.charAt(l);
        }
        return n.charAt(l) + c(l - 1);
    }

    public static void main(String[] args) {
        System.out.print("Enter a string : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextLine();
        sc.close();
        System.out.println("Reverse : " + c(n.length() - 1));
    }
}
