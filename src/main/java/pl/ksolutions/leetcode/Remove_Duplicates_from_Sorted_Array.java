package pl.ksolutions.leetcode;

/**
 * Difficulty: Easy
 * <p/>
 * <p/>
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * <p/>
 * Do not allocate extra space for another array, you must do this in place with constant memory.
 * <p/>
 * For example,
 * Given input array nums = [1,1,2],
 * <p/>
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.
 *
 * @author Karol Kornecki
 */
public class Remove_Duplicates_from_Sorted_Array {

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 2, 2, 3, 4, 5, 6, 6, 6, 6, 7, 8, 9};
        new Remove_Duplicates_from_Sorted_Array().removeDuplicates(a);
    }

    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] > nums[i]) {
                if (j != i + 1) {
                    swap(nums, j, i + 1);
                }
                i++;
            }
        }
        return i + 1;
    }

    private void swap(int[] nums, int from, int to) {
        int tmp = nums[to];
        nums[to] = nums[from];
        nums[from] = tmp;
    }
}
