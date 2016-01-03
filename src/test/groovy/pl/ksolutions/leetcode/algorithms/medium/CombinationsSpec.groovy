package pl.ksolutions.leetcode.algorithms.medium

import spock.lang.Specification

class CombinationsSpec extends Specification {

    def "Should return possible combinations of k number out of 1...n"(int n, int k, List<List<Integer>> expected) {

        when:
        def result = new Combinations().combine(n, k)

        then:
        result == expected

        where:
        n | k | expected
        4 | 2 | [[1, 2], [1, 3], [1, 4], [2, 3], [2, 4], [3, 4]]
    }
}
