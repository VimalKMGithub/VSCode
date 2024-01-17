import java.util.Scanner;

public class c0039_reverse_String {
    static StringBuilder c(StringBuilder n) {
        char f;
        for (int i = 0; i < n.length() / 2; i++) {
            f = n.charAt(i);
            n.setCharAt(i, n.charAt(n.length() - i - 1));
            n.setCharAt(n.length() - i - 1, f);
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.print("Enter a string : ");
        Scanner sc = new Scanner(System.in);
        StringBuilder n = new StringBuilder(sc.nextLine());
        sc.close();
        System.out.println("Reverse of string : " + c(n));
    }
}
