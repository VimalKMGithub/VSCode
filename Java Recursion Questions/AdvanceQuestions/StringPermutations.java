package AdvanceQuestions;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {
    public List<String> permutations(String str) {
        List<String> result = new ArrayList<>();
        permutations(str, new StringBuilder(""), result);
        return result;
    }

    private void permutations(String str, StringBuilder permutation, List<String> result) {
        if (str.length() == 0) {
            result.add(permutation.toString());
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            permutations(newStr, permutation.append(curChar), result);
            permutation.deleteCharAt(permutation.length() - 1);
        }
    }

    public static void main(String[] args) {
        StringPermutations sol = new StringPermutations();
        System.out.println(sol.permutations("abc"));
    }
}