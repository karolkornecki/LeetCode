package pl.ksolutions.leetcode.algorithms.easy;

/**
 * Difficulty: Easy
 * <p>
 * Reverse digits of an integer.
 * <p>
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 * <p>
 * click to show spoilers.
 * Have you thought about this?
 * <p>
 * Here are some good questions to ask before coding. Bonus points for you if you have already thought through this!
 * <p>
 * If the integer's last digit is 0, what should the output be? ie, cases such as 10, 100.
 * <p>
 * Did you notice that the reversed integer might overflow? Assume the input is a 32-bit integer, then the reverse of 1000000003 overflows. How should you handle such cases?
 * <p>
 * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 *
 * @author Karol Kornecki
 */
public class Reverse_Integer {

    public int reverse(int x) {
        return reverse(x, 0);
    }

    private int reverse(int x, long acc) {
        if (acc > Integer.MAX_VALUE || acc < Integer.MIN_VALUE) {
            return 0;
        }
        if (x == 0) {
            return (int) acc;
        }
        return reverse(x / 10, 10 * acc + x % 10);
    }
}
