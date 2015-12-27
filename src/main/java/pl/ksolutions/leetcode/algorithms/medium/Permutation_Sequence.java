package pl.ksolutions.leetcode.algorithms.medium;

import pl.ksolutions.leetcode.algorithms.annotations.TimeLimitExceeded;

import java.util.ArrayList;
import java.util.List;

/**
 * Difficulty: Medium
 * <p>
 * The set [1,2,3,…,n] contains a total of n! unique permutations.
 * <p>
 * By listing and labeling all of the permutations in order,
 * We get the following sequence (ie, for n = 3):
 * <p>
 * "123"
 * "132"
 * "213"
 * "231"
 * "312"
 * "321"
 * <p>
 * Given n and k, return the kth permutation sequence.
 * <p>
 * Note: Given n will be between 1 and 9 inclusive.
 *
 * @author Karol Kornecki
 */
public class Permutation_Sequence {

    @TimeLimitExceeded
    public String getPermutation(int n, int k) {
        if (k == 0) {
            return "";
        }
        StringBuilder b = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            b.append(i);
        }
        List<String> p = new ArrayList<>();
        permute("", b.toString(), p, k);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < p.size(); i++) {
            builder.append(p.get(i));
            builder.append("\n");
        }
        builder.delete(builder.length() - 1, builder.length());
        return builder.toString();
    }

    private void permute(String prefix, String rest, List<String> permutations, int k) {
        if (rest.length() == 0) {
            permutations.add(prefix);
            return;
        }
        for (int i = 0; i < rest.length(); i++) {
            permute(prefix + rest.charAt(i), rest.substring(0, i) + rest.substring(i + 1, rest.length()), permutations, k);
            if (permutations.size() == k) {
                return;
            }
        }
    }


}
