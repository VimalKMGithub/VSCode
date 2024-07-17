package IntermediateQuestions;

import java.util.ArrayList;
import java.util.List;

public class SubSequences {
    public List<String> subSequences(String str) {
        List<String> result = new ArrayList<>();
        subSequences(str, 0, new StringBuilder(""), result);
        return result;
    }

    private void subSequences(String str, int idx, String newStr, List<String> result) {
        if (idx == str.length()) {
            result.add(newStr);
            return;
        }
        subSequences(str, idx + 1, newStr + str.charAt(idx), result);
        subSequences(str, idx + 1, newStr, result);
    }

    private void subSequences(String str, int idx, StringBuilder newStr, List<String> result) {
        if (idx == str.length()) {
            result.add(newStr.toString());
            return;
        }
        subSequences(str, idx + 1, newStr.append(str.charAt(idx)), result);
        newStr.deleteCharAt(newStr.length() - 1);
        subSequences(str, idx + 1, newStr, result);
    }

    public static void main(String[] args) {
        SubSequences solution = new SubSequences();
        System.out.println(solution.subSequences("aaa"));
    }
}