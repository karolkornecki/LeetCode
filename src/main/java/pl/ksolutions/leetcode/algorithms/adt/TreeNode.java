package pl.ksolutions.leetcode.algorithms.adt;

/**
 * @author Karol Kornecki
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int x) {
        val = x;
    }

    public TreeNode(TreeNode l, TreeNode r) {
        left = l;
        right = r;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return val + (left == null ? "$" : left.toString()) + (right == null ? "#" : right.toString());
    }
}
