import java.util.Scanner;

public class c0037_replace_Letter {
    static String c(String n, char r, char s) {
        return n.replace(r, s);
    }

    public static void main(String[] args) {
        System.out.print("Enter a string : ");
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        System.out.print("Enter letter you want to replace : ");
        char r = sc.next().charAt(0);
        System.out.print("Enter letter you want to replace with : ");
        char s = sc.next().charAt(0);
        sc.close();
        System.out.println("New string : " + c(n, r, s));
    }
}
