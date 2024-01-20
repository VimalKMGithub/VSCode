public class x1 {
    public static void main(String[] args) {
        int a[] = { 5, 4, 3, 2, 1 };
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            // a[i] += a[min];
            // a[min] = a[i] - a[min];
            // a[i] -= a[min];
            a[i] ^= a[min];
            a[min] ^= a[i];
            a[i] ^= a[min];
        }
        for (int i : a) {
            System.out.println(i);
        }
    }
}