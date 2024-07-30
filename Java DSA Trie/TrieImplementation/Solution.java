package TrieImplementation;

import java.util.List;

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

    public boolean startsWith(String prefix) {
        TrieNode current = root;
        for (char ch : prefix.toCharArray()) {
            int index = ch - 'a';
            if (current.children[index] == null) {
                return false;
            }
            current = current.children[index];
        }
        return true;
    }

    public boolean wordBreak(String key, List<String> wordDict) {
        for (String word : wordDict) {
            insert(word);
        }
        return wordBreak(key);
    }

    private boolean wordBreak(String key) {
        int length = key.length();
        if (length == 0) {
            return true;
        }
        for (int i = 1; i <= length; i++) {
            if (search(key.substring(0, i)) && wordBreak(key.substring(i))) {
                return true;
            }
        }
        return false;
    }

    public int countNodes(TrieNode node) {
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (node.children[i] != null) {
                count += countNodes(node.children[i]);
            }
        }
        return count + 1;
    }

    public int uniqueSubstrings(String key) {
        for (int i = 0; i < key.length(); i++) {
            String subString = key.substring(i);
            insert(subString);
        }
        return countNodes(root);
    }
}