import java.util.*;

public class Largest_Permutation {

    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        int n = scc.nextInt();
        int k = scc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scc.nextInt();
        }
        scc.close();

        for (int i = 0; i < k && i < n; i++) {
            int j;
            for (j = i; j < n; j++) {
                if (arr[j] == n - i) {
                    break;
                }
            }
            if (j != i) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            } else {
                k++;
            }
        }

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}