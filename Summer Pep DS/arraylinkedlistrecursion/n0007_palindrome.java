public class n0007_palindrome {
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // palindrome using two pointers
    private boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
        }
        return true;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // palindrome using recursion
    private boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(n)
    // palindrome using recursion
    private boolean isPalindromeRecursiveSubString(String str) {
        int strLength = str.length();
        if (strLength == 0 || strLength == 1) {
            return true;
        }
        if (str.charAt(0) != str.charAt(strLength - 1)) {
            return false;
        }
        return isPalindromeRecursiveSubString(str.substring(1, strLength - 1));
    }
}