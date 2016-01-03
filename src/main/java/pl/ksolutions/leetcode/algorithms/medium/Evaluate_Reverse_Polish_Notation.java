package pl.ksolutions.leetcode.algorithms.medium;

import java.util.Stack;

/**
 * Difficulty: Medium
 * <p>
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * <p>
 * Valid operators are +, -, *, /. Each operand may be an integer or another expression.
 * <p>
 * Some examples:
 * <p>
 * ["2", "1", "+", "3", "*"] -> ((2 + 1) * 3) -> 9
 * ["4", "13", "5", "/", "+"] -> (4 + (13 / 5)) -> 6
 *
 * @author Karol Kornecki
 */
public class Evaluate_Reverse_Polish_Notation {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if ("+".equals(tokens[i])) {
                Integer a = stack.pop();
                Integer b = stack.pop();
                stack.push(a + b);
            } else if ("-".equals(tokens[i])) {
                Integer a = stack.pop();
                Integer b = stack.pop();
                stack.push(b - a);
            } else if ("*".equals(tokens[i])) {
                Integer a = stack.pop();
                Integer b = stack.pop();
                stack.push(a * b);
            } else if ("/".equals(tokens[i])) {
                Integer a = stack.pop();
                Integer b = stack.pop();
                stack.push(b / a);
            } else {
                stack.push(Integer.valueOf(tokens[i]));
            }
        }
        return stack.pop();
    }
}
