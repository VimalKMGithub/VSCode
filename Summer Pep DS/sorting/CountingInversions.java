package sorting;

public class CountingInversions {
    public static void main(String[] args) {
        CountingInversions solution = new CountingInversions();
        int[] arr = { 1, 20, 6, 4, 5 };
        System.out.println(solution.countInversions(arr));
    }

    // Time complexity: O(n^2)
    // Space complexity: O(1)
    private int countInversions(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}