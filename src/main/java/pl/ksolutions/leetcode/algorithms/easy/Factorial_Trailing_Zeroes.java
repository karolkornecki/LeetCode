package pl.ksolutions.leetcode.algorithms.easy;

/**
 * Difficulty: Easy
 * <p>
 * Given an integer n, return the number of trailing zeroes in n!.
 * <p>
 * Note: Your solution should be in logarithmic time complexity.
 *
 * @author Karol Kornecki
 */
public class Factorial_Trailing_Zeroes {

    public int trailingZeroes(int n) {
        if (n < 5) {
            return 0;
        }
        return n / 5 + trailingZeroes(n / 5);
    }

    public int trailingZeroesIterative(int n) {
        int zeros = 0;
        while (n >= 5) {
            zeros += (n / 5);
            n /= 5;
        }
        return zeros;
    }
}
