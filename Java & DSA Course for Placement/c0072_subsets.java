import java.util.ArrayList;
import java.util.Scanner;

public class c0072_subsets {
    static int[] b;

    static void c(int r, ArrayList<Integer> a) {
        if (r == 0) {
            if (a.size() != 0) {
                for (int i = 0; i < a.size(); i++) {
                    if (i == 0 && i != (a.size() - 1)) {
                        System.out.print("{" + b[a.get(i) - 1]);
                    } else if (i == 0 && i == (a.size() - 1)) {
                        System.out.print("{" + b[a.get(i) - 1] + "}");
                    } else if (i != 0 && i == (a.size() - 1)) {
                        System.out.print(", " + b[a.get(i) - 1] + "}");
                    } else {
                        System.out.print(", " + b[a.get(i) - 1]);
                    }
                }
                System.out.print(" ");
            }
            return;
        }
        a.add(r);
        c(r - 1, a);
        a.remove(a.size() - 1);
        c(r - 1, a);
    }

    public static void main(String[] args) {
        System.out.print("Enter number of elements in a set (natural number) : ");
        Scanner sc = new Scanner(System.in);
        b = new int[sc.nextInt()];
        if (b.length > 0) {
            System.out.print("Enter set elements : ");
            for (int i = 0; i < b.length; i++) {
                b[i] = sc.nextInt();
            }
            sc.close();
            System.out.print("Set you entered : ");
            for (int i = 0; i < b.length; i++) {
                if (i == 0 && i != (b.length - 1)) {
                    System.out.print("{" + b[i]);
                } else if (i == 0 && i == (b.length - 1)) {
                    System.out.println("{" + b[i] + "}");
                } else if (i != 0 && i == (b.length - 1)) {
                    System.out.println(", " + b[i] + "}");
                } else {
                    System.out.print(", " + b[i]);
                }
            }
            System.out.print("Subsets : ");
            c(b.length, new ArrayList<Integer>());
            System.out.print("{}");
        } else {
            System.out.println("Invalid Input");
        }
    }
}