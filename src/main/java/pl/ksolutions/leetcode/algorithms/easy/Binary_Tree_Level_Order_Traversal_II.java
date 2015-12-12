package pl.ksolutions.leetcode.algorithms.easy;

import pl.ksolutions.leetcode.algorithms.adt.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Difficulty: Easy
 * <p>
 * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
 * <p>
 * For example:
 * Given binary tree {3,9,20,#,#,15,7},
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * <p>
 * return its bottom-up level order traversal as:
 * <p>
 * [
 * [15,7],
 * [9,20],
 * [3]
 * ]
 * <p>
 * confused what "{1,#,2,3}" means?
 *
 * @author Karol Kornecki
 */
public class Binary_Tree_Level_Order_Traversal_II {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return Collections.EMPTY_LIST;
        }
        List<List<Integer>> list = levelOrderBottom(root, new ArrayList<>(), 0);
        List<List<Integer>> reversed = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }

    private List<List<Integer>> levelOrderBottom(TreeNode root, List<List<Integer>> levels, int level) {
        if (levels.size() == level) {
            levels.add(new ArrayList<>());
        }
        levels.get(level).add(root.val);
        if (root.left != null) {
            levelOrderBottom(root.left, levels, level + 1);
        }
        if (root.right != null) {
            levelOrderBottom(root.right, levels, level + 1);
        }
        return levels;
    }
}
