package pl.ksolutions.leetcode.easy;

import org.junit.Assert;

/**
 * Difficulty: Easy
 * <p>
 * Given an integer, write a function to determine if it is a power of two.
 *
 * @author Karol Kornecki
 */
public class Power_of_Two {

    public static void main(String[] args) {

        Assert.assertTrue(new Power_of_Two().isPowerOfTwo(1));
        Assert.assertFalse(new Power_of_Two().isPowerOfTwo(0));
        Assert.assertFalse(new Power_of_Two().isPowerOfTwo(-1));

        Assert.assertTrue(new Power_of_Two().isPowerOfTwo(16));
        Assert.assertTrue(new Power_of_Two().isPowerOfTwo(4));
        Assert.assertTrue(new Power_of_Two().isPowerOfTwo(512));

        Assert.assertFalse(new Power_of_Two().isPowerOfTwo(6));
        Assert.assertFalse(new Power_of_Two().isPowerOfTwo(92));
        Assert.assertFalse(new Power_of_Two().isPowerOfTwo(188));

    }

    public boolean isPowerOfTwo(int n) {
        if (n == 1) {
            return true;
        }
        if (n <= 0 || n % 2 != 0) {
            return false;
        }
        return isPowerOfTwo(n / 2);
    }
}
