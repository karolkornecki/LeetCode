package pl.ksolutions.leetcode.algorithms.easy

import spock.lang.Specification

class Climbing_StairsSpec extends Specification {

    def "Should return number of ways to reach the top."() {

        when:
        int result = new Climbing_Stairs().climbStairs(n)

        then:
        result == expected

        where:
        n | expected
        0 | 0
        1 | 1
        2 | 2
        3 | 3
        4 | 5
    }
}
