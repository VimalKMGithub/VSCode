import java.util.Scanner;

public class c0076_merge_Sort {
    static int[] ar;

    static void co(int s, int m, int e) {
        int[] me = new int[e - s + 1];
        int i1 = s, i2 = m + 1, c = 0;
        while (i1 <= m && i2 <= e) {
            if (ar[i1] <= ar[i2]) {
                me[c++] = ar[i1++];
            } else {
                me[c++] = ar[i2++];
            }
        }
        while (i1 <= m) {
            me[c++] = ar[i1++];
        }
        while (i2 <= e) {
            me[c++] = ar[i2++];
        }
        for (int i = 0, j = s; i < me.length; i++, j++) {
            ar[j] = me[i];
        }
    }

    static void di(int s, int e) {
        if (s >= e) {
            return;
        }
        di(s, s + (e - s) / 2);
        di(s + (e - s) / 2 + 1, e);
        co(s, s + (e - s) / 2, e);
    }

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
        di(0, n - 1);
        System.out.print("Sorted array : ");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
