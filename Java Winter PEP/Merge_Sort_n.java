import java.util.*;

/* basic idea is to divide the arrays in two parts using recurion
and then merging them up once they are sorted
 */
public class Merge_Sort_n {
    public static int[] mergeSort(int ar[], int low, int high) {
        if (low == high) {
            int[] base = new int[1];
            base[0] = ar[low];
            return base;
        }

        int mid = (low + high) / 2;
        int[] a1 = mergeSort(ar, low, mid);
        int[] a2 = mergeSort(ar, mid + 1, high);

        int[] res2 = mergeArrays(a1, a2);
        return res2;
    }

    public static int[] mergeArrays(int a[], int b[]) {
        int[] res = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                res[k] = a[i];
                i++;
                k++;
            } else {

                res[k] = b[j];
                j++;
                k++;
            }
        }
        while (i < a.length) {
            res[k] = a[i];
            i++;
            k++;
        }
        while (j < b.length) {
            res[k] = b[j];
            j++;
            k++;
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 23, 4, 56, 1, 2, 95 };
        int low = 0;
        int high = arr.length - 1;

        int ans[] = mergeSort(arr, low, high);
        System.out.println(Arrays.toString(ans));

    }

}