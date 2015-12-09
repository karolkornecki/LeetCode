package pl.ksolutions.leetcode.algorithms.easy

import pl.ksolutions.leetcode.algorithms.structures.TreeNode
import spock.lang.Specification


class Minimum_Depth_of_Binary_TreeTest extends Specification {

    def "Should return nim depth of tree"(TreeNode tree, int expected) {

        when:
        int result = new Minimum_Depth_of_Binary_Tree().minDepth(tree)

        then:
        result == expected

        where:
        tree                                                                       | expected
        new TreeNode(new TreeNode(), new TreeNode())                               | 2
        new TreeNode()                                                             | 1
        null                                                                       | 0
        new TreeNode(new TreeNode(), new TreeNode(new TreeNode(null, null), null)) | 2
    }
}
