package pl.ksolutions.leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Difficulty: Medium
 * <p>
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * <p>
 * For example, given n = 3, a solution set is:
 * <p>
 * "((()))", "(()())", "(())()", "()(())", "()()()"
 *
 * @author Karol Kornecki
 */
public class Generate_Parentheses {

    public List<String> generateParenthesis(int n) {
        List<String> parentheses = new ArrayList<>();
        generateParenthesis("", n, 0, 0, parentheses);
        return parentheses;
    }

    private void generateParenthesis(String prefix, int n, int left, int right, List<String> parentheses) {
        if (left == n && right == n) {
            parentheses.add(prefix);
            return;
        }
        if (left < n) {
            generateParenthesis(prefix + "(", n, left + 1, right, parentheses);
        }
        if (right < left) {
            generateParenthesis(prefix + ")", n, left, right + 1, parentheses);
        }
    }
}
