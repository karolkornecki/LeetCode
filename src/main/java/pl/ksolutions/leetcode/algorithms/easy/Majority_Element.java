package pl.ksolutions.leetcode.algorithms.easy;

import org.junit.Assert;

import java.util.Arrays;

/**
 * Difficulty: Easy
 * <p/>
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 * <p/>
 * You may assume that the array is non-empty and the majority element always exist in the array.
 *
 * @author Karol Kornecki
 */
public class Majority_Element {

    public int majorityElement(int[] nums) {
        Assert.assertTrue(nums.length > 0);

        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
