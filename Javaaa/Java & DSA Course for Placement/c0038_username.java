import java.util.Scanner;

public class c0038_username {
    static String c(String n) {
        return n.substring(0, n.indexOf('@'));
    }

    public static void main(String[] args) {
        System.out.print("Enter your email : ");
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        sc.close();
        System.out.println("Username : " + c(n));
    }
}
