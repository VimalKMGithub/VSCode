package strings.s0runLenencoding;

public class Solution {
    // Time: O(n), Space: O(n)
    public String runLengthEncoding(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char currentChar = str.charAt(i);
            stringBuilder.append(currentChar);
            int count = 0;
            while (i < str.length() && str.charAt(i) == currentChar) {
                count++;
                i++;
            }
            stringBuilder.append(count);
        }
        return stringBuilder.toString();
    }
}