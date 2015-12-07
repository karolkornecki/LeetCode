package pl.ksolutions.leetcode.algorithms.easy.trees;

import pl.ksolutions.leetcode.algorithms.structures.TreeNode;

/**
 * Difficulty: Easy
 * <p>
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
 * <p>
 * For example, this binary tree is symmetric:
 * <p>
 * 1
 * / \
 * 2   2
 * / \ / \
 * 3  4 4  3
 * <p>
 * But the following is not:
 * <p>
 * 1
 * / \
 * 2   2
 * \   \
 * 3    3
 * <p>
 * Note:
 * Bonus points if you could solve it both recursively and iteratively.
 * <p>
 * confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
 * <p>
 * OJ's Binary Tree Serialization:
 * <p>
 * The serialization of a binary tree follows a level order traversal, where '#' signifies a path terminator where no node exists below.
 * <p>
 * Here's an example:
 * <p>
 * 1
 * / \
 * 2   3
 * /
 * 4
 * \
 * 5
 * <p>
 * The above binary tree is serialized as "{1,2,3,#,#,4,#,#,5}".
 *
 * @author Karol Kornecki
 */
public class Symmetric_Tree {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric(root.left, root.right);
    }

    private boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        if (!isSymmetric(left.left, right.right)) {
            return false;
        }
        if (!isSymmetric(left.right, right.left)) {
            return false;
        }
        return true;
    }
}
