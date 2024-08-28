import java.util.Scanner;

public class c0063_strictly_Increasing_Sorted_Array {
    static int[] a;

    static boolean c(int i) {
        if (i == a.length - 1) {
            return true;
        }
        if (a[i] >= a[i + 1]) {
            return false;
        }
        return c(i + 1);
    }

    public static void main(String[] args) {
        System.out.print("Enter size of array : ");
        Scanner sc = new Scanner(System.in);
        a = new int[sc.nextInt()];
        System.out.print("Enter array elements : ");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        System.out.print("Array you entered : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        if (c(0)) {
            System.out.println("\nEntered array is strictly increasing");
        } else {
            System.out.println("\nEntered array is not strictly increasing");
        }
    }
}
