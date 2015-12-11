package pl.ksolutions.leetcode.algorithms.easy

import spock.lang.Specification

class Add_BinarySpec extends Specification {

    def "Should add two binary numbers"(String a, String b, String expected) {

        when:
        String result = new Add_Binary().addBinary(a, b)

        then:
        result == expected

        where:
        a    | b    | expected
        "0"  | "0"  | "0"
        "1"  | "1"  | "10"
        "1"  | "10" | "11"
        "10" | "10" | "100"
    }
}
