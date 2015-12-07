package pl.ksolutions.leetcode.algorithms.easy.trees;

import pl.ksolutions.leetcode.algorithms.structures.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Difficulty: Easy
 * <p>
 * Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
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
 * return its level order traversal as:
 * <p>
 * [
 * [3],
 * [9,20],
 * [15,7]
 * ]
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
public class Binary_Tree_Level_Order_Traversal {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        if (root == null) {
            return new ArrayList<>();
        }
        levelOrder(root, levels, 0);
        return levels;
    }

    public void levelOrder(TreeNode node, List<List<Integer>> levels, int level) {
        if (levels.size() == level) {
            levels.add(new ArrayList<>());
        }
        levels.get(level).add(node.val);
        if (node.left != null) {
            levelOrder(node.left, levels, level + 1);
        }
        if (node.right != null) {
            levelOrder(node.right, levels, level + 1);
        }
    }
}
