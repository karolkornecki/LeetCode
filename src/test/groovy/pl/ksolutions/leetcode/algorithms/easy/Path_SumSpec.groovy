package pl.ksolutions.leetcode.algorithms.easy

import pl.ksolutions.leetcode.algorithms.adt.TreeNode
import spock.lang.Specification

class Path_SumSpec extends Specification {

    def "Should return true if tree has path sum, otherwise should return false"(TreeNode tree, int sum, boolean expected) {

        when:
        boolean result = new Path_Sum().hasPathSum(tree, sum)

        then:
        result == expected

        where:
        tree                                                                                                                                                                  | sum | expected
        new TreeNode(5, new TreeNode(4, new TreeNode(11, new TreeNode(7), new TreeNode(2)), null), new TreeNode(8, new TreeNode(13), new TreeNode(4, null, new TreeNode(1)))) | 22  | true

    }

}
