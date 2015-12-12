package pl.ksolutions.leetcode.algorithms.easy

import pl.ksolutions.leetcode.algorithms.adt.TreeNode
import spock.lang.Specification


class Binary_Tree_Level_Order_Traversal_IISpec extends Specification {

    def "Should return level ordered elements list"(TreeNode tree, List<List<Integer>> expected) {

        when:
        def result = new Binary_Tree_Level_Order_Traversal_II().levelOrderBottom(tree)

        then:
        result == expected

        where:
        tree                                                                                  | expected
        new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7))) | [[15, 7], [9, 20], [3]]
    }

}
