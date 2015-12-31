package pl.ksolutions.leetcode.algorithms.easy

import spock.lang.Specification
import spock.lang.Unroll

class House_RobberSpec extends Specification {

    @Unroll
    def "Should return max amount of money robber can steal one night"(int expected, int[] i) {

        when:
        int result = new House_Robber().rob(i)

        then:
        result == expected

        where:
        expected | i
        60       | [10, 1, 20, 2, 10, 1, 20]
        40       | [1, 10, 2, 20, 1, 10, 2]
        40       | [10, 1, 20, 2, 10, 1]
        60       | [1, 30, 2, 20, 1, 10]
        54       | [50, 50, 1, 2, 1, 2]
        0        | []
        100      | [100]
        50       | [50, 40]
        4        | [2, 1, 1, 2]
        9        | [4, 2, 2, 5]
        5        | [1,2,2,1,2]
    }
}
