package pl.ksolutions.leetcode.easy;

import org.junit.Assert;

/**
 * Difficulty: Easy
 * <p/>
 * Given a binary tree, find its maximum depth.
 * <p/>
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * @author Karol Kornecki
 */
public class Maximum_Depth_of_Binary_Tree {

    public static void main(String[] args) {
        Assert.assertEquals(1, new Maximum_Depth_of_Binary_Tree().maxDepth(new TreeNode(null, null)));
        Assert.assertEquals(2, new Maximum_Depth_of_Binary_Tree().maxDepth(new TreeNode(new TreeNode(null, null), null)));
        Assert.assertEquals(2, new Maximum_Depth_of_Binary_Tree().maxDepth(new TreeNode(new TreeNode(null, null), new TreeNode(null, null))));
        Assert.assertEquals(3, new Maximum_Depth_of_Binary_Tree().maxDepth(new TreeNode(new TreeNode(new TreeNode(null, null), null), null)));
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(TreeNode l, TreeNode r) {
            left = l;
            right = r;
        }
    }
}
