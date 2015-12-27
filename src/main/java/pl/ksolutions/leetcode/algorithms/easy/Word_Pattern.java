package pl.ksolutions.leetcode.algorithms.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Difficulty: Easy
 * <p>
 * Given a pattern and a string str, find if str follows the same pattern.
 * <p>
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
 * <p>
 * Examples:
 * <p>
 * pattern = "abba", str = "dog cat cat dog" should return true.
 * pattern = "abba", str = "dog cat cat fish" should return false.
 * pattern = "aaaa", str = "dog cat cat dog" should return false.
 * pattern = "abba", str = "dog dog dog dog" should return false.
 * <p>
 * Notes:
 * You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.
 *
 * @author Karol Kornecki
 */
public class Word_Pattern {

    public boolean wordPattern(String pattern, String str) {
        if (pattern == null || str == null) {
            return false;
        }
        String[] array = str.split(" ");
        if (array.length != pattern.length()) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (map.get(pattern.charAt(i)) == null) {
                if (map.values().contains(array[i])) {
                    return false;
                }
                map.put(pattern.charAt(i), array[i]);
            } else {
                if (!map.get(pattern.charAt(i)).equals(array[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
