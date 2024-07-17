package stack.s0balancedBrackets;

import java.util.Stack;

public class Solution {
    private boolean isOpeningBracket(char ch) {
        return ch == '(' || ch == '{' || ch == '[';
    }

    private char getMatchingOpeningBracket(char ch) {
        if (ch == ')') {
            return '(';
        } else if (ch == '}') {
            return '}';
        } else {
            return ']';
        }
    }

    // Time: O(n), Space: O(n)
    public boolean areBracketsBalanced(String brackets) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < brackets.length(); i++) {
            char bracket = brackets.charAt(i);
            if (isOpeningBracket(bracket)) {
                stack.push(bracket);
                continue;
            }
            if (stack.empty()) {
                return false;
            }
            char expectedOpeningBracket = getMatchingOpeningBracket(bracket);
            if (stack.peek() != expectedOpeningBracket) {
                return false;
            } else {
                stack.pop();
            }
        }
        return stack.empty();
    }

    // public boolean areBracketsBalanced(String brackets) {
    // Stack<Character> stack = new Stack<>();
    // for (int i = 0; i < brackets.length(); i++) {
    // char bracket = brackets.charAt(i);
    // switch (bracket) {
    // case '(':
    // case '{':
    // case '[':
    // stack.push(bracket);
    // break;
    // case ')':
    // if (stack.isEmpty() || stack.pop() != '(')
    // return false;
    // break;
    // case '}':
    // if (stack.isEmpty() || stack.pop() != '{')
    // return false;
    // break;
    // case ']':
    // if (stack.isEmpty() || stack.pop() != '[')
    // return false;
    // break;
    // default:
    // return false;
    // }
    // }
    // return stack.isEmpty();
    // }
}