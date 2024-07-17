public class s0008_string_to_int {
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // string to int using recursion
    private int stringToIntRecursive(String str, int num, int index) {
        if (index == str.length()) {
            return num;
        }
        int digit = str.charAt(index) - '0';
        num = num * 10 + digit;
        return stringToIntRecursive(str, num, index + 1);

    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // string to int
    private int stringToInt(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            int digit = str.charAt(i) - '0';
            result = result * 10 + digit;
        }
        return result;
    }
}
