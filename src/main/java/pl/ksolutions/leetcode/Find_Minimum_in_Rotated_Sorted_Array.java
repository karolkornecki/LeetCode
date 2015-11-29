package pl.ksolutions.leetcode;

/**
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 * <p/>
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 * <p/>
 * Find the minimum element.
 * <p/>
 * You may assume no duplicate exists in the array.
 *
 * @author Karol Kornecki
 */
public class Find_Minimum_in_Rotated_Sorted_Array {

    public int findMin(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return nums[i];
            }
        }
        return nums[0];
    }
}
