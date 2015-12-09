package pl.ksolutions.leetcode.algorithms.easy;

import java.util.Stack;

/**
 * Difficulty: Easy
 * <p>
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 *
 * @author Karol Kornecki
 */
public class Valid_Parentheses {

    public boolean isValid(String s) {
        if (s == null) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!isValidChar(ch)) {
                return false;
            }
            if (isOpening(ch)) {
                stack.push(ch);
            } else {
                if (stack.empty()) {
                    return false;
                }
                Character opening = stack.pop();
                if (!isValidClosing(opening, ch)) {
                    return false;
                }
            }
        }
        return stack.empty();
    }

    private boolean isValidClosing(char opening, char ch) {
        if (opening == '(') {
            return ch == ')';
        }
        if (opening == '{') {
            return ch == '}';
        }
        if (opening == '[') {
            return ch == ']';
        }
        throw new RuntimeException(opening + " is not valid parenthesis");
    }

    private boolean isOpening(char c) {
        return c == '[' || c == '{' || c == '(';
    }

    private boolean isValidChar(char c) {
        if (c == '[' || c == ']' || c == '(' || c == ')' || c == '{' || c == '}') {
            return true;
        }
        return false;
    }

}
