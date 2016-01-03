package pl.ksolutions.leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Difficulty: Medium
 * <p>
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
 * <p>
 * For example,
 * If n = 4 and k = 2, a solution is:
 * <p>
 * [
 * [2,4],
 * [3,4],
 * [2,3],
 * [1,2],
 * [1,3],
 * [1,4],
 * ]
 *
 * @author Karol Kornecki
 */
public class Combinations {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combinations = new ArrayList<>();
        combine(1, n, k, combinations, new ArrayList<>());
        return combinations;
    }

    private void combine(int start, int n, int k, List<List<Integer>> combinations, List<Integer> buffer) {
        for (int i = start; i <= n; i++) {
            buffer.add(i);
            if (buffer.size() == k) {
                combinations.add(new ArrayList<>(buffer));
            }
            combine(i + 1, n, k, combinations, buffer);
            buffer.remove(buffer.size() - 1);
        }
    }
}
