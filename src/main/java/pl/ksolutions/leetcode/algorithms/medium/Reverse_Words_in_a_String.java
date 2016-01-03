package pl.ksolutions.leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Difficulty: Medium
 * <p>
 * Given an input string, reverse the string word by word.
 * <p>
 * For example,
 * Given s = "the sky is blue",
 * return "blue is sky the".
 * <p>
 * Update (2015-02-12):
 * For C programmers: Try to solve it in-place in O(1) space.
 * <p>
 * click to show clarification.
 * Clarification:
 * <p>
 * What constitutes a word?
 * A sequence of non-space characters constitutes a word.
 * Could the input string contain leading or trailing spaces?
 * Yes. However, your reversed string should not contain leading or trailing spaces.
 * How about multiple spaces between two words?
 * Reduce them to a single space in the reversed string.
 *
 * @author Karol Kornecki
 */
public class Reverse_Words_in_a_String {

    //using split built-in method
    public String reverseWords(String s) {
        if (s == null) {
            return s;
        }
        if (s.trim().equals("")) {
            return "";
        }
        String[] arr = s.split("\\s+");
        StringBuilder b = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            b.append(arr[i].trim());
            b.append(" ");
        }
        return b.toString().trim();
    }

    public String reverseWords2(String s) {
        if (s == null) {
            return s;
        }
        if (s.trim().equals("")) {
            return "";
        }
        String lower = s.toLowerCase();
        List<String> list = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (lower.charAt(i) == ' ') {
                if (builder.length() > 0) {
                    list.add(builder.toString());
                    builder = new StringBuilder();
                }
                continue;
            }
            builder.append(s.charAt(i));
        }
        if (builder.length() > 0) {
            list.add(builder.toString());
        }
        builder = new StringBuilder();
        for (int i = list.size() - 1; i >= 0; i--) {
            builder.append(list.get(i));
            if (i != 0) {
                builder.append(" ");
            }
        }
        return builder.toString();
    }
}
