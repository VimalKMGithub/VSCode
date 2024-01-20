public class day8 {
    public static void main(String[] args) {
        // // 1st method
        // int a[] = { 5, 4, 3, 2, 1 };
        // for (int i = 0; i < a.length - 1; i++) {
        // boolean isSwapped = false;
        // for (int j = 0; j < a.length - i - 1; j++) {
        // if (a[j] > a[j + 1]) {
        // a[j] += a[j + 1];
        // a[j + 1] = a[j] - a[j + 1];
        // a[j] -= a[j + 1];
        // isSwapped = true;
        // }
        // }
        // if (isSwapped == false) {
        // break;
        // }
        // }
        // for (int i : a) {
        // System.out.println(i);
        // }
        // // 2nd method
        // int a[] = { 5, 4, 3, 2, 1 };
        // for (int i = 0; i < a.length - 1; i++) {
        // boolean isSwapped = false;
        // for (int j = 0; j < a.length - i - 1; j++) {
        // if (a[j] > a[j + 1]) {
        // a[j] ^= a[j + 1];
        // a[j + 1] ^= a[j];
        // a[j] ^= a[j + 1];
        // isSwapped = true;
        // }
        // }
        // if (isSwapped == false) {
        // break;
        // }
        // }
        // for (int i : a) {
        // System.out.println(i);
        // }
    }
}
