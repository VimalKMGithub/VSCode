import java.util.Scanner;

public class s0001_clear_Input_Buffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number : ");
        int age = sc.nextInt();
        System.out.println(age);
        sc.nextLine();
        System.out.print("Enter a string : ");
        String name = sc.nextLine();
        System.out.println(name);
        sc.close();
    }
}