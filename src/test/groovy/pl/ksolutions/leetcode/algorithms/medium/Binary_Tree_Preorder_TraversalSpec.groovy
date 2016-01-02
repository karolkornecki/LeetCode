package pl.ksolutions.leetcode.algorithms.medium

import pl.ksolutions.leetcode.algorithms.adt.TreeNode
import spock.lang.Specification

class Binary_Tree_Preorder_TraversalSpec extends Specification {

    def "Should return nodes in pre order (recursive)"(TreeNode tree, int[] expected) {

        when:
        def result = new Binary_Tree_Preorder_Traversal().preorderTraversalRecursive(tree)

        then:
        result == expected

        where:
        tree                                              | expected
        new TreeNode(3, new TreeNode(1), new TreeNode(2)) | [3, 1, 2]
    }

    def "Should return nodes in pre order (iterative)"(TreeNode tree, int[] expected) {

        when:
        def result = new Binary_Tree_Preorder_Traversal().preorderTraversal(tree)

        then:
        result == expected

        where:
        tree                                              | expected
        new TreeNode(3, new TreeNode(1), new TreeNode(2)) | [3, 1, 2]
    }
}
