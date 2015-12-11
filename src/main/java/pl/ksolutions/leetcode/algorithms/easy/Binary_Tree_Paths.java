package pl.ksolutions.leetcode.algorithms.easy;

import pl.ksolutions.leetcode.algorithms.adt.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Difficulty: Easy
 * <p>
 * Given a binary tree, return all root-to-leaf paths.
 * <p>
 * For example, given the following binary tree:
 * <p>
 * 1
 * /   \
 * 2     3
 * \
 * 5
 * <p>
 * All root-to-leaf paths are:
 * <p>
 * ["1->2->5", "1->3"]
 *
 * @author Karol Kornecki
 */
public class Binary_Tree_Paths {

    public List<String> binaryTreePaths(TreeNode root) {
        return binaryTreePaths(root, new ArrayList<>(), "");
    }

    private List<String> binaryTreePaths(TreeNode root, List<String> list, String s) {
        if (root == null) {
            return list;
        }
        s += root.val;
        if (isLeaf(root)) {
            list.add(s);
        }
        s += "->";
        binaryTreePaths(root.left, list, s);
        binaryTreePaths(root.right, list, s);
        return list;
    }

    private boolean isLeaf(TreeNode root) {
        return root.left == null && root.right == null;
    }
}
