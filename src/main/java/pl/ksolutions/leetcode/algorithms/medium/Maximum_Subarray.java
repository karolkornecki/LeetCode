package pl.ksolutions.leetcode.algorithms.medium;

/**
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 * <p>
 * For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
 * the contiguous subarray [4,−1,2,1] has the largest sum = 6.
 * <p>
 * click to show more practice.
 * More practice:
 * <p>
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 *
 * @author Karol Kornecki
 */
public class Maximum_Subarray {

    //Kadane's algorithm
    public int maxSubArray(int[] nums) {
        int currentMax = nums[0];
        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            if (currentMax > max) {
                max = currentMax;
            }
        }
        return max;
    }
}
