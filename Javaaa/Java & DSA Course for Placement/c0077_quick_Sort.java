import java.util.Scanner;

public class c0077_quick_Sort {
    static int[] ar;

    public static void main(String[] args) {
        System.out.print("Enter size of array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ar = new int[n];
        System.out.print("Enter array elements : ");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        sc.close();
    }
}
