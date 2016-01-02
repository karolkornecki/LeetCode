package pl.ksolutions.leetcode.algorithms.medium

import spock.lang.Specification

class PermutationsSpec extends Specification {


    def "Should return all permutations of given array"(int[] nums, int[][] expected) {

        when:
        def result = new Permutations().permute(nums)

        then:
        result == expected

        where:
        nums      | expected
        [1, 2, 3] | [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
    }
}
