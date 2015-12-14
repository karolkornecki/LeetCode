package pl.ksolutions.leetcode.algorithms.easy

import spock.lang.Specification


class String_to_Integer_atoiSpec extends Specification {

    def "Should convert string to int or return 0"(String str, int expected) {

        when:
        int result = new String_to_Integer_atoi().myAtoi(str)

        then:
        result == expected

        where:
        str                   | expected
        "1"                   | 1
        null                  | 0
        "a"                   | 0
        "    45"              | 45
        " 34gb "              | 34
        "-1"                  | -1
        "1234"                | 1234
        "  -0012a12"          | -12
        "9223372036854775809" | 2147483647
        "-2147483648"         | -2147483648
        "-2147483647"         | -2147483647
    }
}
