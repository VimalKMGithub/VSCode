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

        // int a[] = { 5, 4, 3, 2, 1 };
        // for (int i = 1; i < a.length; i++) {
        // int key=a[i];
        // int j=i-1;
        // while (j>=0&&a[j]>key) {
        // a[j+1]=a[j];
        // j--;
        // }
        // a[j+1]=key;
        // }
        // for (int i : a) {
        // System.out.println(i);
        // }

        // int a[] = { 5, 4, 3, 2, 1 };
        // for (int i = 0; i < a.length - 1; i++) {
        // int min = i;
        // for (int j = i + 1; j < a.length; j++) {
        // if (a[j] < a[min]) {
        // min = j;
        // }
        // }
        // int te = a[min];
        // a[min] = a[i];
        // a[i] = te;
        // // // this will result in wrong output
        // // a[i] += a[min];
        // // a[min] = a[i] - a[min];
        // // a[i] -= a[min];
        // // // this will also result in wrong output
        // // a[i] ^= a[min];
        // // a[min] ^= a[i];
        // // a[i] ^= a[min];
        // }
        // for (int i : a) {
        // System.out.println(i);
        // }
    }
}
