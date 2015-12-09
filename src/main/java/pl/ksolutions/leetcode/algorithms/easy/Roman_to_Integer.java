package pl.ksolutions.leetcode.algorithms.easy;

import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

/**
 * Difficulty: Easy
 * <p/>
 * Given a roman numeral, convert it to an integer.
 * <p/>
 * Input is guaranteed to be within the range from 1 to 3999.
 *
 * @author Karol Kornecki
 */
public class Roman_to_Integer {

    private static Map<String, Integer> nums = new HashMap<String, Integer>();

    static {
        nums.put("M", 1000);
        nums.put("CM", 900);
        nums.put("D", 500);
        nums.put("CD", 400);
        nums.put("C", 100);
        nums.put("XC", 90);
        nums.put("L", 50);
        nums.put("XL", 40);
        nums.put("X", 10);
        nums.put("IX", 9);
        nums.put("V", 5);
        nums.put("IV", 4);
        nums.put("I", 1);
    }


    public static void main(String[] args) {
        Assert.assertEquals(621, new Roman_to_Integer().romanToInt("DCXXI"));
    }

    public int romanToInt(String s) {
        Assert.assertTrue(s != null);

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i != s.length() - 1) {
                Integer val = nums.get("" + s.charAt(i) + s.charAt(i + 1));
                if (val != null) {
                    result += val;
                    i++;
                } else {
                    result += nums.get("" + s.charAt(i));
                }
            } else {
                result += nums.get("" + s.charAt(i));
            }
        }
        return result;
    }
}
