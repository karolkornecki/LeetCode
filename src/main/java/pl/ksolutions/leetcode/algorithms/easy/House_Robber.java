package pl.ksolutions.leetcode.algorithms.easy;

/**
 * Difficulty: Easy
 * <p>
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security system connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 * <p>
 * Given a list of non-negative integers representing the amount of money of each house, determine the maximum amount of money you can rob tonight without alerting the police.
 *
 * @author Karol Kornecki
 */
public class House_Robber {

    public int rob(int[] nums) {
        int s1 = 0;
        int s2 = 0;
        for (int i = 0, j = 1; i < nums.length; i += 2, j += 2) {
            s1 += nums[i];
            if (i != nums.length - 1) {
                s2 += nums[j];
            }
        }
        return Math.max(s1, s2);
    }
}
