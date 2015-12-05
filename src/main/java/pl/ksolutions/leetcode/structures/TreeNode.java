package pl.ksolutions.leetcode.structures;

/**
 * @author Karol Kornecki
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public TreeNode(TreeNode l, TreeNode r) {
        left = l;
        right = r;
    }
}
