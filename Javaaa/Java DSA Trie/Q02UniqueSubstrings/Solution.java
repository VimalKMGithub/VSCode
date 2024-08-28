package Q02UniqueSubstrings;

import java.util.HashSet;
import java.util.List;

public class Solution {
    public List<String> uniqueSubstrings(String input) {
        HashSet<String> uniqueSubstrings = new HashSet<>();
        int length = input.length();
        for (int i = 0; i < length; i++) {
            StringBuilder substring = new StringBuilder();
            for (int j = i; j < length; j++) {
                substring.append(input.charAt(j));
                uniqueSubstrings.add(substring.toString());
            }
        }
        return List.copyOf(uniqueSubstrings);
    }
}
