package pl.ksolutions.leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Difficulty: Medium
 * <p>
 * Given a collection of distinct numbers, return all possible permutations.
 * <p>
 * For example,
 * [1,2,3] have the following permutations:
 * [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1].
 *
 * @author Karol Kornecki
 */
public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        if (nums == null) {
            return null;
        }
        List<List<Integer>> permutations = new ArrayList<>();
        permute(new ArrayList<>(), nums, permutations);
        return permutations;
    }

    private void permute(List<Integer> prefix, int[] rest, List<List<Integer>> permutations) {
        if (rest.length == 0) {
            permutations.add(prefix);
        }
        for (int i = 0; i < rest.length; i++) {
            permute(copyAndAppend(prefix, rest[i]), copyWithoutElement(rest, i), permutations);
        }
    }

    private List<Integer> copyAndAppend(List<Integer> list, Integer element) {
        List<Integer> copy = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            copy.add(list.get(i));
        }
        copy.add(element);
        return copy;
    }

    private int[] copyWithoutElement(int[] rest, int element) {
        int[] copy = new int[rest.length - 1];
        int i = 0;
        int j = 0;
        while (i < copy.length) {
            if (j == element) {
                j++;
                continue;
            }
            copy[i++] = rest[j++];
        }
        return copy;
    }
}
