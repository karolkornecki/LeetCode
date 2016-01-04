package pl.ksolutions.leetcode.algorithms.medium;

/**
 * Difficulty: Medium
 * <p>
 * Given a string array words, find the maximum value of length(word[i]) * length(word[j]) where the two words do not share common letters. You may assume that each word will contain only lower case letters. If no such two words exist, return 0.
 * <p>
 * Example 1:
 * <p>
 * Given ["abcw", "baz", "foo", "bar", "xtfn", "abcdef"]
 * Return 16
 * The two words can be "abcw", "xtfn".
 * <p>
 * Example 2:
 * <p>
 * Given ["a", "ab", "abc", "d", "cd", "bcd", "abcd"]
 * Return 4
 * The two words can be "ab", "cd".
 * <p>
 * Example 3:
 * <p>
 * Given ["a", "aa", "aaa", "aaaa"]
 * Return 0
 * No such pair of words.
 *
 * @author Karol Kornecki
 */
public class Maximum_Product_of_Word_Lengths {

    public int maxProduct(String[] words) {
        int[] mask = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            mask[i] = getMask(words[i]);
        }
        int maximum_product = 0;

        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if ((mask[i] & mask[j]) == 0) {
                    int current_product = words[i].length() * words[j].length();
                    if (current_product > maximum_product) {
                        maximum_product = current_product;
                    }
                }
            }
        }
        return maximum_product;
    }

    private int getMask(String word) {
        int mask = 0;
        for (int j = 0; j < word.length(); j++) {
            mask |= 1 << (word.charAt(j) - 'a');
        }
        return mask;
    }
}
