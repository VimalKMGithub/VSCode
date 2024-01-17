import java.util.HashSet;
import java.util.Scanner;

public class c0067_unique_Subsequences {
    static String a;
    static HashSet<String> b = new HashSet<String>();

    static void c(int i, String s) {
        if (i == a.length()) {
            if (b.contains(s)) {
                return;
            }
            b.add(s);
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
        System.out.println("Unique subsequences of '" + a + "'");
        c(0, "");
    }
}
