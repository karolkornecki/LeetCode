package pl.ksolutions.leetcode.algorithms.medium

import spock.lang.Specification

class Maximum_SubarraySpec extends Specification {

    def "Should return maximum sub-array sum"(int[] array, int expected) {

        when:
        int result = new Maximum_Subarray().maxSubArray(array)

        then:
        result == expected

        where:
        array                           | expected
        [-2, 1, -3, 4, -1, 2, 1, -5, 4] | 6
    }
}
