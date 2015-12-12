package pl.ksolutions.leetcode.algorithms.easy;

/**
 * Difficulty: Easy
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 * <p>
 * If the last word does not exist, return 0.
 * <p>
 * Note: A word is defined as a character sequence consists of non-space characters only.
 * <p>
 * For example,
 * Given s = "Hello World",
 * return 5.
 *
 * @author Karol Kornecki
 */
public class Length_of_Last_Word {

    public int lengthOfLastWord(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int length = 0;
        boolean start = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                if (!start) {
                    start = true;
                }
                length++;
            } else if (start) {
                return length;
            }
        }
        return length;
    }
}
