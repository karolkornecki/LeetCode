package pl.ksolutions.leetcode.algorithms.easy

import pl.ksolutions.leetcode.algorithms.adt.TreeNode
import spock.lang.Specification


class Binary_Tree_PathsSpec extends Specification {

    def "Should return all tree paths"(TreeNode tree, List<String> expected) {

        when:
        List<String> result = new Binary_Tree_Paths().binaryTreePaths(tree)

        then:
        result == expected

        where:
        tree                                                                     | expected
        new TreeNode(1, new TreeNode(2, new TreeNode(5), null), new TreeNode(3)) | ["1->2->5", "1->3"]
    }
}
