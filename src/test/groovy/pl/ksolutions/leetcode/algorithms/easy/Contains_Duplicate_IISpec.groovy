package pl.ksolutions.leetcode.algorithms.easy

import spock.lang.Specification

class Contains_Duplicate_IISpec extends Specification {

    def "Should return true if there are duplicate in array in a given distance at most"(int[] nums, int k, boolean expected) {

        when:
        boolean result = new Contains_Duplicate_II().containsNearbyDuplicate(nums, k)

        then:
        result == expected

        where:
        nums                     | k | expected
        [1, 2, 3, 1, 2, 4, 5, 6] | 3 | true
        [1, 2, 3, 1, 2, 4, 5, 6] | 2 | false
        [1, 2, 3, 1, 2, 4, 5, 6] | 1 | false
        []                       | 1 | false
        [1]                      | 0 | false
        [1]                      | 1 | false
        [-1, -1]                 | 1 | true
        [99, 99]                 | 2 | true
        [1]                      | 1 | false
        [1, 2]                   | 2 | false
    }
}
