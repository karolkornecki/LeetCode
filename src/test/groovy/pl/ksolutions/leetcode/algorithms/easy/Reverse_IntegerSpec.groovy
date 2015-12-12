package pl.ksolutions.leetcode.algorithms.easy

import spock.lang.Specification


class Reverse_IntegerSpec extends Specification {

    def "Should reverse integer or return 0 if reversed numer overflows int"(int x, int expected) {

        when:
        int result = new Reverse_Integer().reverse(x)

        then:
        result == expected

        where:
        x          | expected
        123        | 321
        0          | 0
        100        | 1
        10         | 1
        1000000003 | 0
    }
}
