import java.util.Scanner;

public class c0049_bubble_Sort {
    static void c(int[] a) {
        int t;
        for (int i = 0; i < a.length - 1; i++) {
            boolean r = false;
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                    r = true;
                }
            }
            if (r == false) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter size of array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.print("Enter array elements : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        System.out.print("Array you entered : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        c(a);
        System.out.print("\nSorted array : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
