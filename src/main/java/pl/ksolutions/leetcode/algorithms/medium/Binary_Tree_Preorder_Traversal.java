package pl.ksolutions.leetcode.algorithms.medium;

import pl.ksolutions.leetcode.algorithms.adt.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Given a binary tree, return the preorder traversal of its nodes' values.
 * <p>
 * For example:
 * Given binary tree {1,#,2,3},
 * <p>
 * 1
 * \
 * 2
 * /
 * 3
 * <p>
 * return [1,2,3].
 * <p>
 * Note: Recursive solution is trivial, could you do it iteratively?
 *
 * @author Karol Kornecki
 */
public class Binary_Tree_Preorder_Traversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            TreeNode n = stack.pop();
            list.add(n.val);
            if (n.right != null) {
                stack.push(n.right);
            }
            if (n.left != null) {
                stack.push(n.left);
            }
        }
        return list;
    }


    //better performance in leetcode judge
    public List<Integer> preorderTraversalRecursive(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preorderTraversalRecursive(root, list);
        return list;
    }

    private void preorderTraversalRecursive(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        preorderTraversalRecursive(root.left, list);
        preorderTraversalRecursive(root.right, list);
    }
}
