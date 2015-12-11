package pl.ksolutions.leetcode.algorithms.easy;

import pl.ksolutions.leetcode.algorithms.adt.TreeNode;

/**
 * Difficulty: Easy
 * <p>
 * Given a binary tree, find its minimum depth.
 * <p>
 * The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.
 *
 * @author Karol Kornecki
 */
public class Minimum_Depth_of_Binary_Tree {

    public int minDepth(TreeNode root) {
        return minDepth(root, 0);
    }

    private int minDepth(TreeNode root, int i) {
        if (root == null) {
            return i;
        }
        if (isLeaf(root)) {
            return i + 1;
        }
        i++;
        if (root.left != null && root.right != null) {
            return Math.min(minDepth(root.left, i), minDepth(root.right, i));
        }
        if (root.left != null) {
            return minDepth(root.left, i);
        } else {
            return minDepth(root.right, i);
        }
    }

    private boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }
}
