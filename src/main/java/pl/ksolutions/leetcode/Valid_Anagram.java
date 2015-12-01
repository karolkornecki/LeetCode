package pl.ksolutions.leetcode;

import java.util.Arrays;

/**
 * Difficulty: Easy
 * <p/>
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * <p/>
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 * <p/>
 * Note:
 * You may assume the string contains only lowercase alphabets.
 * <p/>
 * Follow up:
 * What if the inputs contain unicode characters? How would you adapt your solution to such case?
 *
 * @author Karol Kornecki
 */
public class Valid_Anagram {

    public boolean isAnagram(String s, String t) {
        if (s == null && t == null) {
            return true;
        }
        if (s.length() == 0 && t.length() == 0) {
            return true;
        }
        if (s.length() != t.length()) {
            return false;
        }
        char[] ss = s.toCharArray();
        Arrays.sort(ss);

        char[] tt = t.toCharArray();
        Arrays.sort(tt);

        for (int i = 0; i < tt.length; i++) {
            if (ss[i] != tt[i]) {
                return false;
            }
        }
        return true;
    }
}
