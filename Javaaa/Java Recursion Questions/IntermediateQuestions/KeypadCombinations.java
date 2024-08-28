package IntermediateQuestions;

import java.util.ArrayList;
import java.util.List;

public class KeypadCombinations {
    public List<String> keyCombinations(String keys, String[] keyMaps) {
        List<String> result = new ArrayList<>();
        keyCombinations(keys, 0, new StringBuilder(""), keyMaps, result);
        return result;
    }

    private void keyCombinations(String keys, int idx, String combination, String[] keyMaps, List<String> result) {
        if (idx == keys.length()) {
            result.add(combination);
            return;
        }
        char key = keys.charAt(idx);
        String keyMap = keyMaps[key - '0'];
        for (int i = 0; i < keyMap.length(); i++) {
            keyCombinations(keys, idx + 1, combination + keyMap.charAt(i), keyMaps, result);
        }
    }

    private void keyCombinations(String keys, int idx, StringBuilder combination, String[] keyMaps,
            List<String> result) {
        if (idx == keys.length()) {
            result.add(combination.toString());
            return;
        }
        char key = keys.charAt(idx);
        String keyMap = keyMaps[key - '0'];
        for (int i = 0; i < keyMap.length(); i++) {
            keyCombinations(keys, idx + 1, combination.append(keyMap.charAt(i)), keyMaps, result);
            combination.deleteCharAt(combination.length() - 1);
        }
    }

    public static void main(String[] args) {
        KeypadCombinations solution = new KeypadCombinations();
        String[] keyMaps = new String[] { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };
        System.out.println(solution.keyCombinations("77", keyMaps));
    }
}