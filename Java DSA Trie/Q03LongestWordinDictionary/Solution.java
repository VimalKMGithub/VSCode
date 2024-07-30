package Q03LongestWordinDictionary;

public class Solution {
    private class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEndOfWord = false;
    }

    private final TrieNode root;

    public Solution() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }
        current.isEndOfWord = true;
    }

    public boolean search(String word) {
        TrieNode current = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (current.children[index] == null) {
                return false;
            }
            current = current.children[index];
        }
        return current.isEndOfWord;
    }

    public String longestWord(String[] words) {
        for (String word : words) {
            insert(word);
        }
        StringBuilder temp = new StringBuilder();
        String[] ans = { "" };
        longestWord(root, temp, ans);
        return ans[0];
    }

    private void longestWord(TrieNode root, StringBuilder temp, String[] ans) {
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].isEndOfWord) {
                temp.append((char) (i + 'a'));
                if (temp.length() > ans[0].length()) {
                    ans[0] = temp.toString();
                }
                longestWord(root.children[i], temp, ans);
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }
}