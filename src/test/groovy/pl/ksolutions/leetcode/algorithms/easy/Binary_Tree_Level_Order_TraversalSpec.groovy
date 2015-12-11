package pl.ksolutions.leetcode.algorithms.easy

import pl.ksolutions.leetcode.algorithms.adt.TreeNode
import spock.lang.Specification

class Binary_Tree_Level_Order_TraversalSpec extends Specification {

    def "Should return list of tree node values from left to right"() {

        given:
        TreeNode root = new TreeNode(3, new TreeNode(9),new TreeNode(20, new TreeNode(15), new TreeNode(7)))

        when:
        Binary_Tree_Level_Order_Traversal sus = new Binary_Tree_Level_Order_Traversal()
        def result = sus.levelOrder(root);

        then:
        result == [[3], [9, 20], [15, 7]]
    }
}
