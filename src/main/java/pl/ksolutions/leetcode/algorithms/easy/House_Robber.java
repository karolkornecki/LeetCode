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
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                s1 = Math.max(s1 + nums[i], s2);
            } else {
                s2 = Math.max(s2 + nums[i], s1);
            }
        }
        return Math.max(s1, s2);
    }
}
