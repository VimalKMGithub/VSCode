package Recursion.Intermediate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Q03UniqueSubsequences {
    public List<String> getUniqueSubsequences(String str) {
        HashSet<String> result = new HashSet<>();
        getUniqueSubsequences(str, new StringBuilder(), 0, result);
        return new ArrayList<>(result);
    }

    private void getUniqueSubsequences(String str, StringBuilder sb, int index, HashSet<String> result) {
        if (index == str.length()) {
            result.add(sb.toString());
            return;
        }
        getUniqueSubsequences(str, sb, index + 1, result);
        sb.append(str.charAt(index));
        getUniqueSubsequences(str, sb, index + 1, result);
        sb.deleteCharAt(sb.length() - 1);
    }

    public static void main(String[] args) {
        Q03UniqueSubsequences obj = new Q03UniqueSubsequences();
        String str = "aaa";
        List<String> result = obj.getUniqueSubsequences(str);
        System.out.println(result);
    }
}
