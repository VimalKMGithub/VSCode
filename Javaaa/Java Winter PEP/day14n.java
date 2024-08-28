import java.util.HashMap;

public class day14n {
    public static int maxSubarraySum(int[] arr) {
        int currentSum = arr[0];
        int maxSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    static void countDistinct(int arr[], int n, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        System.out.print(map.size() + " ");
        for (int i = k; i < n; i++) {
            if (map.get(arr[i - k]) == 1) {
                map.remove(arr[i - k]);
            } else {
                map.put(arr[i - k], map.get(arr[i - k]) - 1);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            System.out.print(map.size() + " ");
        }
    }

    public static void main(String[] args) {
        // int[] arr = { 15, 2, 3, -2, 1 };
        // int result = maxSubarraySum(arr);
        // System.out.println("Max subarray sum is: " + result);

        int N = 7;
        int K = 4;
        int[] A = { 1, 2, 1, 3, 4, 2, 3 };
        countDistinct(A, N, K);
    }
}
// Which interface type can lambda expressions be used for in Java?
// options
// 1: A Abstract Classes
// 2: B Function Interfaces [correct answer is 2]
// 3: C Normal Interfaces
// 4: D All of the above

// What is the syntax for a lambda expression in Java?
// A. (parameters) -> expression
// B.(parameters) -> { statements }
// C.(parameters) -> { return expression; }
// D.None of the above
// E.All of the above [correct answer is E]
