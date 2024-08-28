import java.util.Scanner;

public class c0064_move_All_Occurence_Of_An_Element_To_End {
    static String a;
    static char b;
    static int c = 0;

    static String c(int i) {
        if (i == a.length()) {
            String d = "";
            for (int j = 0; j < c; j++) {
                d += b;
            }
            return d;
        }
        if (a.charAt(i) == b) {
            c++;
            return c(i + 1);
        } else {
            return a.charAt(i) + c(i + 1);
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter a string : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
        System.out.print("Enter character : ");
        b = sc.next().charAt(0);
        sc.close();
        System.out.println("Result : " + c(0));
    }
}
