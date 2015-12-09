package pl.ksolutions.leetcode.algorithms.easy;

import org.junit.Assert;

/**
 * Difficulty: Easy
 * <p>
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * <p>
 * For example,
 * "A man, a plan, a canal: Panama" is a palindrome.
 * "race a car" is not a palindrome.
 * <p>
 * Note:
 * Have you consider that the string might be empty? This is a good question to ask during an interview.
 * <p>
 * For the purpose of this problem, we define empty string as valid palindrome.
 *
 * @author Karol Kornecki
 */
public class Valid_Palindrom {

    public static void main(String[] args) {

        Assert.assertTrue(new Valid_Palindrom().isPalindrome("A man, a plan, a canal: Panama"));
        Assert.assertFalse(new Valid_Palindrom().isPalindrome("race a car"));
        Assert.assertTrue(new Valid_Palindrom().isPalindrome(""));
        Assert.assertFalse(new Valid_Palindrom().isPalindrome("1a2"));

    }

    public boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        if (s.length() == 0) {
            return true;
        }
        int length = s.length();
        int i = 0;
        int j = length - 1;
        while (i <= j) {
            if (!isAlphanumeric(s.charAt(i))) {
                i++;
            } else if (!isAlphanumeric(s.charAt(j))) {
                j--;
            } else if (normalize(s.charAt(i)) != normalize(s.charAt(j))) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }

    private boolean isAlphanumeric(char c) {
        if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
            return true;
        }
        return false;
    }

    private char normalize(char c) {
        if ((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z')) {
            return c;
        }
        return (char) (c + 32);
    }
}
