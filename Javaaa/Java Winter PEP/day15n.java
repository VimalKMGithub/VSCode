import java.util.Arrays;

interface SumCalculator {
    int calculateSum(int a, int b);
}

public class day15n {
    static void findMajority(int arr[], int n) {
        int maxCount = 0;
        int index = -1;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }
        if (maxCount > n / 2)
            System.out.println(arr[index]);
        else
            System.out.println("No Majority Element");
    }

    public static void main(String[] args) {
        // SumCalculator sumCalculator = (a, b) -> a + b;
        // int num1 = 5;
        // int num2 = 7;
        // int result = sumCalculator.calculateSum(num1, num2);
        // System.out.println("Sum of " + num1 + " and " + num2 + " is: " + result);

        // int A[] = { 3, 1, 3, 3, 2 };
        // int n = A.length;
        // findMajority(A, n);

        // int Arr[] = { 12, 35, 1, 10, 34, 1 };
        // Arrays.sort(Arr);
        // System.out.println(Arr[Arr.length - 2]);

        int Arr[] = { 12, 35, 1, 10, 34, 1 };
        int max = Integer.MIN_VALUE, secondmax = Integer.MIN_VALUE;
        for (int num : Arr) {
            if (num > max) {
                secondmax = max;
                max = num;
            } else if (num > secondmax && num != max) {
                secondmax = num;
            }
        }
        System.out.println(secondmax);
    }
}
// What does the following lambda expression represent?
// options
// 1: A accepts two parameters and does nothing
// 2: B does nothing and returns void [correct answer is 2]
// 3: C lambda that throws an exception
// 4: D None of the above