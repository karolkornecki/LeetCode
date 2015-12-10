package pl.ksolutions.leetcode.algorithms.easy

import spock.lang.Specification

class Factorial_Trailing_ZeroesTest extends Specification {

    def "Should return trailing zeros number (recursive)"(int n, int expected) {

        when:
        int result = new Factorial_Trailing_Zeroes().trailingZeroes(n);

        then:
        result == expected

        where:
        n  | expected
        6  | 1
        5  | 1
        4  | 0
        50 | 12
        30 | 7
        15 | 3
    }

    def "Should return trailing zeros number (iterative)"(int n, int expected) {

        when:
        int result = new Factorial_Trailing_Zeroes().trailingZeroes(n);

        then:
        result == expected

        where:
        n  | expected
        6  | 1
        5  | 1
        4  | 0
        50 | 12
        30 | 7
        15 | 3
    }
}
