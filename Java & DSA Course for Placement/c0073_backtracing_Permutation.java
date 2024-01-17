import java.util.Scanner;

public class c0073_backtracing_Permutation {
    static void c(String a, String p) {
        if (a.length() == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 0; i < a.length(); i++) {
            c(a.substring(0, i) + a.substring(i + 1), p + a.charAt(i));
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter a string : ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        sc.close();
        System.out.println("Permutations");
        c(a, "");
    }
}
