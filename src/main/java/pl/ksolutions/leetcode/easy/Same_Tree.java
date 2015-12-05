package pl.ksolutions.leetcode.easy;

import pl.ksolutions.leetcode.structures.TreeNode;

/**
 * Difficulty: Easy
 * <p/>
 * Given two binary trees, write a function to check if they are equal or not.
 * <p/>
 * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
 *
 * @author Karol Kornecki
 */
public class Same_Tree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        }
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
