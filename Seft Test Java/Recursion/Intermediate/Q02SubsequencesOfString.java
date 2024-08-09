package Recursion.Intermediate;

import java.util.ArrayList;
import java.util.List;

public class Q02SubsequencesOfString {
    public List<String> getSubsequences(String str) {
        List<String> result = new ArrayList<>();
        getSubsequences(str, new StringBuilder(), 0, result);
        return result;
    }

    private void getSubsequences(String str, StringBuilder sb, int index, List<String> result) {
        if (index == str.length()) {
            result.add(sb.toString());
            return;
        }
        getSubsequences(str, sb, index + 1, result);
        sb.append(str.charAt(index));
        getSubsequences(str, sb, index + 1, result);
        sb.deleteCharAt(sb.length() - 1);
    }

    public static void main(String[] args) {
        Q02SubsequencesOfString obj = new Q02SubsequencesOfString();
        String str = "aaa";
        List<String> result = obj.getSubsequences(str);
        System.out.println(result);
    }
}
