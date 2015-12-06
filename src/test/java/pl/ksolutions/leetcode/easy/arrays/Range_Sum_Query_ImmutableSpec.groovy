package pl.ksolutions.leetcode.easy.arrays

import spock.lang.Specification

class Range_Sum_Query_ImmutableSpec extends Specification {

    def "Should return correct range sum for queries"(int i, int j, int c) {

        given:
        int[] nums = [-2, 0, 3, -5, 2, -1]

        when:
        int result = new Range_Sum_Query_Immutable.NumArray(nums).sumRange(i, j)

        then:
        result == c

        where:
        i | j | c
        0 | 2 | 1
        2 | 5 | -1
        0 | 5 | -3
    }

}
