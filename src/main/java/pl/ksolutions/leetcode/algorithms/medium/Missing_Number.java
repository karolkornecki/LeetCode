package pl.ksolutions.leetcode.algorithms.medium;

import java.util.Arrays;

/**
 * Difficulty: Medium
 * <p>
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 * <p>
 * For example,
 * Given nums = [0, 1, 3] return 2.
 * <p>
 * Note:
 * Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 *
 * @author Karol Kornecki
 */
public class Missing_Number {

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 0) {
            return -1;
        }
        if (nums[0] != 0) {
            return 0;
        }
        int sum = ((nums[nums.length - 1]) * (nums[nums.length - 1] + 1)) / 2;
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            current += nums[i];
        }
        int missing = sum - current;
        if (missing == 0) {
            return nums[nums.length - 1] + 1;
        }
        return missing;
    }
}
