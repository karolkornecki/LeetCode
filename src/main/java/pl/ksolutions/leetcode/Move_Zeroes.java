package pl.ksolutions.leetcode;

import org.junit.Assert;

/**
 * Difficulty: Easy
 * <p/>
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * <p/>
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 * <p/>
 * Note:
 * <p/>
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 *
 * @author Karol Kornecki
 */
public class Move_Zeroes {

    public static void main(String[] args) {
        int[] a = new int[]{0, 1, 0, 3, 12};
        new Move_Zeroes().moveZeroes(a);
        Assert.assertArrayEquals(new int[]{1, 3, 12, 0, 0}, a);
    }

    //much better concise solution than mine.
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }

    public void mySolution_moveZeroes(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 0 && i != nums.length - 1 && nums[i + 1] != 0) {
                for (int j = i; j < nums.length - 1; j++) {
                    if (nums[j + 1] == 0) {
                        break;
                    }
                    swap(nums, j);
                }
            }
        }
    }

    private void swap(int[] nums, int j) {
        int tmp = nums[j + 1];
        nums[j + 1] = nums[j];
        nums[j] = tmp;
    }
}
