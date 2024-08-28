import java.util.Scanner;

public class c0062_1st_And_Last_Occurence_Of_An_Element {
    static String n;
    static int f = -1, l = -1;
    static char k;

    static void c(int i) {
        if (i == n.length()) {
            return;
        }
        if (n.charAt(i) == k) {
            if (f == -1) {
                f = l = i;
            } else {
                l = i;
            }
        }
        c(i + 1);
    }

    public static void main(String[] args) {
        System.out.print("Enter a string : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextLine();
        System.out.print("Enter a character : ");
        k = sc.next().charAt(0);
        sc.close();
        c(0);
        if (f == -1) {
            System.out.println("Character '" + k + "' is not found in string '" + n + "'");
        } else {
            System.out.println("First occurence of character '" + k + "' is at index '" + f + "'");
            System.out.println("Last occurence of character '" + k + "' is at index '" + l + "'");
        }
    }
}
