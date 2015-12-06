package pl.ksolutions.leetcode.easy.arrays;

import org.junit.Assert;

/**
 * Difficulty: Easy
 * <p>
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 * <p>
 * Note:
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2. The number of elements initialized in nums1 and nums2 are m and n respectively.
 *
 * @author Karol Kornecki
 */
public class Merge_Sorted_Array {

    public static void main(String[] args) {

        int[] nums1 = new int[]{1, 3, 5, 7, 0, 0, 0, 0};
        int[] nums2 = new int[]{2, 4, 6, 8};
        new Merge_Sorted_Array().merge(nums1, 4, nums2, 4);
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, nums1);

        int[] nums3 = new int[]{2, 4, 6, 8, 0, 0, 0, 0};
        int[] nums4 = new int[]{1, 3, 5, 7};
        new Merge_Sorted_Array().merge(nums3, 4, nums4, 4);
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, nums3);

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] merged = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        while (i < m) {
            merged[k++] = nums1[i++];
        }
        while (j < n) {
            merged[k++] = nums2[j++];
        }

        for (int l = 0; l < m + n; l++) {
            nums1[l] = merged[l];
        }
    }
}
