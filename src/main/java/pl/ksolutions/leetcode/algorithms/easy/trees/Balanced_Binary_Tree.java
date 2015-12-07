package pl.ksolutions.leetcode.algorithms.easy.trees;

import org.junit.Assert;
import pl.ksolutions.leetcode.algorithms.structures.TreeNode;

/**
 * Difficulty: Easy
 * <p>
 * Given a binary tree, determine if it is height-balanced.
 * <p>
 * For this problem, a height-balanced binary tree is defined as a binary tree in which the depth of the two subtrees of every node never differ by more than 1.
 *
 * @author Karol Kornecki
 */
public class Balanced_Binary_Tree {

    public static void main(String[] args) {
        Assert.assertTrue(new Balanced_Binary_Tree().isBalanced(new TreeNode(new TreeNode(new TreeNode(null, null), new TreeNode(null, null)), new TreeNode(new TreeNode(null, null), null))));
        Assert.assertFalse(new Balanced_Binary_Tree().isBalanced(new TreeNode(new TreeNode(new TreeNode(null, null), new TreeNode(null, null)), null)));
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return Math.abs(height(root.left) - height(root.right)) <= 1
                && isBalanced(root.left)
                && isBalanced(root.right);
    }

    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return Math.max(1 + height(node.left), 1 + height(node.right));
    }
}
