import java.util.Scanner;

public class c0050_selection_Sort {
    static void c(int[] a) {
        int t, s;
        for (int i = 0; i < a.length - 1; i++) {
            s = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[s]) {
                    s = j;
                }
            }
            t = a[i];
            a[i] = a[s];
            a[s] = t;
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
