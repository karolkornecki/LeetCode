package pl.ksolutions.leetcode.easy;

import org.junit.Assert;
import pl.ksolutions.leetcode.structures.TreeNode;

/**
 * Difficulty: Easy
 * <p/>
 * Invert a binary tree.
 * <p/>
 * 4
 * /   \
 * 2     7
 * / \   / \
 * 1   3 6   9
 * <p/>
 * to
 * <p/>
 * 4
 * /   \
 * 7     2
 * / \   / \
 * 9   6 3   1
 *
 * @author Karol Kornecki
 */
public class Invert_Binary_Tree {

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(4);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(7);
        TreeNode t4 = new TreeNode(1);
        TreeNode t5 = new TreeNode(3);
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(9);

        t1.left = t2;
        t1.right = t3;

        t2.left = t4;
        t2.right = t5;

        t3.left = t6;
        t3.right = t7;


        TreeNode t11 = new TreeNode(4);
        TreeNode t22 = new TreeNode(2);
        TreeNode t33 = new TreeNode(7);
        TreeNode t44 = new TreeNode(1);
        TreeNode t55 = new TreeNode(3);
        TreeNode t66 = new TreeNode(6);
        TreeNode t77 = new TreeNode(9);

        t11.left = t33;
        t11.right = t22;

        t22.left = t55;
        t22.right = t44;

        t33.left = t77;
        t33.right = t66;

        Assert.assertTrue(new Same_Tree().isSameTree(new Invert_Binary_Tree().invertTree(t1), t11));
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode tmp = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = tmp;
        return root;
    }
}


