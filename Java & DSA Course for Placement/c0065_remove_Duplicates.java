import java.util.Scanner;

public class c0065_remove_Duplicates {
    static String a;
    static int c = 0;
    static boolean[] b = new boolean[26];

    static String c(int i) {
        if (i == a.length()) {
            return "";
        }
        if (b[a.charAt(i) - 'a']) {
            return c(i + 1);
        } else {
            b[a.charAt(i) - 'a'] = true;
            return a.charAt(i) + c(i + 1);
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter a string : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
        sc.close();
        System.out.println("Result : " + c(0));
    }
}
