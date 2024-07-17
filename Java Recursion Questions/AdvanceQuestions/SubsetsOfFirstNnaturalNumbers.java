package AdvanceQuestions;

import java.util.ArrayList;
import java.util.List;

public class SubsetsOfFirstNnaturalNumbers {
    public List<List<Integer>> subsets(int n) {
        List<List<Integer>> result = new ArrayList<>();
        subsets(n, new ArrayList<>(), result);
        return result;
    }

    private void subsets(int n, List<Integer> subset, List<List<Integer>> result) {
        if (n == 0) {
            result.add(new ArrayList<>(subset));
            return;
        }
        subset.add(n);
        subsets(n - 1, subset, result);
        subset.removeLast();
        subsets(n - 1, subset, result);
    }

    public static void main(String[] args) {
        SubsetsOfFirstNnaturalNumbers sol = new SubsetsOfFirstNnaturalNumbers();
        System.out.println(sol.subsets(3));
    }
}