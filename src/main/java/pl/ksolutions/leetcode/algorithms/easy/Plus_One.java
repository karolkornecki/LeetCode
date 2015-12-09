package pl.ksolutions.leetcode.algorithms.easy;

/**
 * Difficulty: Easy
 * <p>
 * Given a non-negative number represented as an array of digits, plus one to the number.
 * <p>
 * The digits are stored such that the most significant digit is at the head of the list.
 *
 * @author Karol Kornecki
 */
public class Plus_One {

    public int[] plusOne(int[] digits) {
        return plusOne(digits, digits.length - 1);
    }

    private int[] plusOne(int[] digits, int i) {
        if (digits[i] < 9) {
            digits[i]++;
            return digits;
        }
        if (digits[i] == 9 && i == 0) {
            digits[0] = 0;
            int[] d = new int[digits.length + 1];
            d[0] = 1;
            for (int j = 1; j < d.length; j++) {
                d[j] = digits[j-1];
            }
            return d;
        }
        digits[i] = 0;
        return plusOne(digits, --i);
    }
}
