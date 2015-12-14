package pl.ksolutions.leetcode.algorithms.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Difficulty: Easy
 * <p>
 * Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.
 *
 * @author Karol Kornecki
 */
public class Contains_Duplicate_II {

    //much better
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }


    //my naive solution
    public boolean containsNearbyDuplicate2(int[] nums, int k) {
        int[] sorted = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sorted);

        boolean isDuplicate = false;
        for (int i = 1; i < sorted.length; i++) {
            if (sorted[i - 1] == sorted[i]) {
                isDuplicate = true;
                break;
            }
        }
        if (!isDuplicate) {
            return false;
        }

        if (nums == null) {
            return false;
        }
        if (k == 0) {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < i + 1 + k && j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
