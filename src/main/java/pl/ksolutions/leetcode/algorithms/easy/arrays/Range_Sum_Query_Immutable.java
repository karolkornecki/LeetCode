package pl.ksolutions.leetcode.algorithms.easy.arrays;

/**
 * Given an integer array nums, find the sum of the elements between indices i and j (i ≤ j), inclusive.
 * <p>
 * Example:
 * <p>
 * Given nums = [-2, 0, 3, -5, 2, -1]
 * <p>
 * sumRange(0, 2) -> 1
 * sumRange(2, 5) -> -1
 * sumRange(0, 5) -> -3
 * <p>
 * Note:
 * <p>
 * You may assume that the array does not change.
 * There are many calls to sumRange function.
 *
 * @author Karol Kornecki
 */
public class Range_Sum_Query_Immutable {

    public static class NumArray {

        private int[] nums;

        public NumArray(int[] nums) {
            this.nums = nums;
            if (nums != null && nums.length > 0) {
                sumPrefix();
            }
        }

        private void sumPrefix() {
            int[] n = new int[nums.length];
            n[0] = nums[0];
            for (int i = 1; i < nums.length; i++) {
                n[i] = n[i - 1] + nums[i];
            }
            nums = n;
        }

        public int sumRange(int i, int j) {
            if (i <= i) {
                if (i == 0) {
                    return nums[j];
                } else {
                    return nums[j] - nums[i - 1];
                }
            }
            throw new IllegalArgumentException("i must be greater or equal j !");
        }
    }

}
