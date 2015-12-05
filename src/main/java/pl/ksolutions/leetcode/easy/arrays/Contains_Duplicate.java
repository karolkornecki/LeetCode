package pl.ksolutions.leetcode.easy.arrays;

import org.junit.Assert;
import pl.ksolutions.leetcode.annotations.TimeLimitExceeded;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Difficulty: Easy
 * <p/>
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 *
 * @author Karol Kornecki
 */
public class Contains_Duplicate {

    public static void main(String[] args) {

        Assert.assertEquals(true, new Contains_Duplicate().containsDuplicate(new int[]{1, 2, 3, 4, 4, 5, 5, 6}));
        Assert.assertEquals(false, new Contains_Duplicate().containsDuplicate(new int[]{1, 2, 3, 4}));
    }

    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                return true;
            }
        }
        return false;
    }

    @TimeLimitExceeded
    public boolean containsDuplicate2(int[] nums) {
        Set<Integer> elements = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (elements.contains(nums[i])) {
                return true;
            }
            elements.add(nums[i]);
        }
        return false;
    }
}
