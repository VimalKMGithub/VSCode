import java.util.Scanner;

public class c0066_subsequences {
    static String a;

    static void c(int i, String s) {
        if (i == a.length()) {
            System.out.println(s);
            return;
        }
        c(i + 1, s + a.charAt(i));
        c(i + 1, s);
    }

    public static void main(String[] args) {
        System.out.print("Enter a string : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
        sc.close();
        System.out.println("Subsequences of '" + a + "'");
        c(0, "");
    }
}
