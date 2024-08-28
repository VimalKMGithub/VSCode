import java.util.Arrays;

public class day19n {
    static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    static String reverseWords(String inputStr) {
        String[] words = inputStr.trim().split("\\s+");
        StringBuilder reversedWords = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedWords.append(words[i]);
            if (i > 0) {
                reversedWords.append(" ");
            }
        }
        return reversedWords.toString();
    }

    public static void main(String[] args) {
        // int arr[] = { 1, 2, 3, 4, 5 };
        // Arrays.sort(arr);
        // System.out.println("[" + arr[arr.length - 2] + "," + arr[1] + "]");

        // int arr[] = { 1, 2, 3, 4, 5 };
        // int max = Integer.MIN_VALUE, secondmax = Integer.MIN_VALUE, min =
        // Integer.MAX_VALUE,
        // secondmin = Integer.MAX_VALUE;
        // for (int num : arr) {
        // if (num > max) {
        // secondmax = max;
        // max = num;
        // } else if (num > secondmax && num != max) {
        // secondmax = num;
        // }
        // if (num < min) {
        // secondmin = min;
        // min = num;
        // } else if (num < secondmin && num != min) {
        // secondmin = num;
        // }
        // }
        // System.out.println("[" + secondmax + "," + secondmin + "]");

        // int[] A = { 1, 3, 7, 9, 11, 12, 45 };
        // int target = 3;
        // int result = binarySearch(A, target);
        // System.out.println(result);

        // String inputStr = "I am student ";
        // String outputStr = reverseWords(inputStr);
        // System.out.println(outputStr);

        String str = "i am student";
        String[] str1 = str.split(" ");
        System.out.println(str1.length);
        for (int i = str1.length - 1; i >= 0; i--) {
            System.out.print(str1[i] + " ");
        }
    }
}
// What does the following statement in SQL do? DROP TABLE student;
// options
// 1: Delete a table called student [correct answer is 1]
// 2: create a table called student
// 3: check if there a student table exist
// 4: None