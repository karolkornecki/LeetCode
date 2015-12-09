package pl.ksolutions.leetcode.algorithms.easy;

import org.junit.Assert;

/**
 * Difficulty: Easy
 * <p/>
 * Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).
 * <p/>
 * For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.
 *
 * @author Karol Kornecki
 */
public class Number_of_1_Bits {

    public static void main(String[] args) {
        Assert.assertEquals(3, new Number_of_1_Bits().hammingWeight(11));
    }

    public int hammingWeight(int n) {
        int c = 0;
        while (n != 0) {
            n &= (n - 1);
            ++c;
        }
        return c;
    }

    //my naive implementation
    // you need to treat n as an unsigned value
    public int hammingWeight2(long n) {
        long nn = n > 0 ? n : -n;
        String binStr = toBinary(nn);
        int bits = 0;
        for (int i = 0; i < binStr.length(); i++) {
            if (binStr.charAt(i) == '1') {
                bits++;
            }
        }
        return bits;
    }

    private String toBinary(long n) {
        if (n / 2 == 0) {
            return n % 2 + "";
        }
        return toBinary(n / 2) + (n % 2);
    }
}
