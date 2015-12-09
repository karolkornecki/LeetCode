package pl.ksolutions.leetcode.algorithms.easy;

import java.util.Arrays;

/**
 * Difficulty: Easy
 * <p>
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * @author Karol Kornecki
 */
public class Longest_Common_Prefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        strs = mergeSort(strs);

        for (int i = strs[0].length(); i > 0; i--) {
            String prefix = strs[0].substring(0, i);
            boolean isPrefix = true;
            for (int j = 1; j < strs.length; j++) {
                if (!strs[j].startsWith(prefix)) {
                    isPrefix = false;
                    break;
                }
            }
            if (isPrefix) {
                return prefix;
            }
        }
        return "";
    }

    private String[] mergeSort(String[] list) {
        if (list == null || list.length < 2) {
            return list;
        }

        int middle = list.length / 2;
        String[] left = mergeSort(Arrays.copyOfRange(list, 0, middle));
        String[] right = mergeSort((Arrays.copyOfRange(list, middle, list.length)));

        return merge(left, right);
    }

    private String[] merge(String[] left, String[] right) {
        String[] merged = new String[left.length + right.length];

        int l = 0;
        int r = 0;
        int m = 0;
        while (l < left.length && r < right.length) {
            if (left[l].length() < right[r].length()) {
                merged[m] = left[l];
                l++;
            } else {
                merged[m] = right[r];
                r++;
            }
            m++;
        }

        while (l < left.length) {
            merged[m] = left[l];
            l++;
            m++;
        }

        while (r < right.length) {
            merged[m] = right[r];
            r++;
            m++;
        }
        return merged;
    }
}
