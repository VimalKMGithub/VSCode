package Recursion.Intermediate;

import java.util.ArrayList;
import java.util.List;

public class Q04KeypadCombinations {
    public List<String> keyCombinations(String keys, String[] keyMaps) {
        List<String> result = new ArrayList<>();
        keyCombinations(keys, keyMaps, 0, new StringBuilder(), result);
        return result;
    }

    private void keyCombinations(String keys, String[] keyMaps, int idx, StringBuilder combination,
            List<String> result) {
        if (idx == keys.length()) {
            result.add(combination.toString());
            return;
        }
        char key = keys.charAt(idx);
        String keyMap = keyMaps[key - '0'];
        for (int i = 0; i < keyMap.length(); i++) {
            combination.append(keyMap.charAt(i));
            keyCombinations(keys, keyMaps, idx + 1, combination, result);
            combination.deleteCharAt(combination.length() - 1);
        }
    }

    public static void main(String[] args) {
        Q04KeypadCombinations solution = new Q04KeypadCombinations();
        String[] keyMaps = new String[] { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };
        System.out.println(solution.keyCombinations("77", keyMaps));
    }
}
