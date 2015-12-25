package pl.ksolutions.leetcode.algorithms.easy;


import java.util.HashMap;
import java.util.Map;

/**
 * Difficulty: Easy
 * <p>
 * Given two strings s and t, determine if they are isomorphic.
 * <p>
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * <p>
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
 * <p>
 * For example,
 * Given "egg", "add", return true.
 * <p>
 * Given "foo", "bar", return false.
 * <p>
 * Given "paper", "title", return true.
 * <p>
 * Note:
 * You may assume both s and t have the same length.
 *
 * @author Karol Kornecki
 */
public class Isomorphic_Strings {

    public boolean isIsomorphic(String s, String t) {
        if (s != null && t != null && s.length() != t.length()) {
            return false;
        }
        if (s != null & t != null) {
            boolean[] mapped = new boolean[256];
            Map<Character, Character> map = new HashMap<>();
            for (int i = 0; i < s.length(); i++) {
                Character ss = map.get(s.charAt(i));
                if (ss == null) {
                    if (mapped[t.charAt(i)]) {
                        return false;
                    }
                    map.put(s.charAt(i), t.charAt(i));
                    mapped[t.charAt(i)] = true;
                } else if (t.charAt(i) != ss) {
                    return false;
                }
            }
        }
        return true;
    }
}
