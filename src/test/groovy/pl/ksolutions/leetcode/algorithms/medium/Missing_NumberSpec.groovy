package pl.ksolutions.leetcode.algorithms.medium

import spock.lang.Specification

class Missing_NumberSpec extends Specification {

    def "Should return missing number"(int[] array, int expected) {

        when:
        int result = new Missing_Number().missingNumber(array)

        then:
        result == expected

        where:
        array                       | expected
        [0, 1, 2, 3, 4, 6, 7, 8, 9] | 5
        [0, 2, 3, 4]                | 1
        []                          | -1
        [0, 1, 2, 3]                | 4
        [0]                         | 1
        [1]                         | 0
        [1, 2]                      | 0
    }
}
