package IntermediateQuestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class UniqueSubSequences {
    public List<String> uniqueSubSequences(String str) {
        HashSet<String> result = new HashSet<>();
        uniqueSubSequences(str, 0, new StringBuilder(""), result);
        List<String> finalResult = new ArrayList<>(result);
        return finalResult;
    }

    private void uniqueSubSequences(String str, int idx, String newStr, HashSet<String> result) {
        if (idx == str.length()) {
            result.add(newStr);
            return;
        }
        uniqueSubSequences(str, idx + 1, newStr + str.charAt(idx), result);
        uniqueSubSequences(str, idx + 1, newStr, result);
    }

    private void uniqueSubSequences(String str, int idx, StringBuilder newStr, HashSet<String> result) {
        if (idx == str.length()) {
            result.add(newStr.toString());
            return;
        }
        uniqueSubSequences(str, idx + 1, newStr.append(str.charAt(idx)), result);
        newStr.deleteCharAt(newStr.length() - 1);
        uniqueSubSequences(str, idx + 1, newStr, result);
    }

    public static void main(String[] args) {
        UniqueSubSequences solution = new UniqueSubSequences();
        System.out.println(solution.uniqueSubSequences("aaa"));
    }
}