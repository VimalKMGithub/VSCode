import java.util.Scanner;

public class c0068_keypad_Combinations {
    static String a;
    static String b[] = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    static void c(int i, String s) {
        if (i == a.length()) {
            System.out.println(s);
            return;
        }
        for (int j = 0; j < b[a.charAt(i) - '0'].length(); j++) {
            c(i + 1, s + b[a.charAt(i) - '0'].charAt(j));
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter keypad combination (numeric combination of natural number (0 - 9) ) : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
        sc.close();
        System.out.println("Keypad combination for '" + a + "'");
        c(0, "");
    }
}
