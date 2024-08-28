import java.util.Scanner;

public class c0051_insertion_Sort {
    static void c(int[] a) {
        int r, j;
        for (int i = 1; i < a.length; i++) {
            r = a[i];
            j = i - 1;
            while (j >= 0 && a[j] > r) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = r;
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
