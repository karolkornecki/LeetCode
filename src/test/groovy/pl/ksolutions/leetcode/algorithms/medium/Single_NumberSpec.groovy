package pl.ksolutions.leetcode.algorithms.medium

import spock.lang.Specification

class Single_NumberSpec extends Specification {

    def "Should return number that appear once"(int[] nums, int expected) {

        when:
        int result = new Single_Number().singleNumber(nums)

        then:
        result == expected

        where:
        nums                  | expected
        [1, 2, 3, 4, 4, 3, 2] | 1
        [2, 2, 3, 3, 4, 5, 5] | 4
    }
}
