public class day11n {
    static void printIncreasing(int n) {
        if (n == 0) {
            return;
        }
        printIncreasing(n - 1);
        System.out.println(n);
    }

    static int printMax(int arr[], int n) {
        if (n == 0) {
            return arr[0];
        }
        int max = printMax(arr, n - 1);
        if (max < arr[n]) {
            max = arr[n];
        }
        return max;
    }

    public static void main(String[] args) {
        // printIncreasing(5);

        int arr[] = { 1, 2, 5, 4, 3 };
        int max = printMax(arr, arr.length - 1);
        System.out.println(max);
    }
}
// what is the time complexity of merge sort?
// options
// 1: A O(N)
// 2: B O(N logN) [correct answer is 2]
// 3: C O(n*n)