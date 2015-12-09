package pl.ksolutions.leetcode.algorithms.easy;

import org.junit.Assert;

/**
 * Difficulty: Easy
 * <p>
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * <p>
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 *
 * @author Karol Kornecki
 */
public class Remove_Element {

    public static void main(String[] args) {
        Assert.assertEquals(5, new Remove_Element().removeElement(new int[]{1, 2, 3, 3, 4, 3, 5, 6}, 3));
        Assert.assertEquals(0, new Remove_Element().removeElement(new int[]{3, 3}, 3));
    }

    public int removeElement(int[] nums, int val) {
        if (nums == null) {
            return 0;
        }
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
