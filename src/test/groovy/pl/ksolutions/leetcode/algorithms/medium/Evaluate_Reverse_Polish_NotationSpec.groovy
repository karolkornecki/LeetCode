package pl.ksolutions.leetcode.algorithms.medium

import spock.lang.Specification

class Evaluate_Reverse_Polish_NotationSpec extends Specification {

    def "Should evaluate expression in RPN"(String[] expr, int expected) {

        expect:
        new Evaluate_Reverse_Polish_Notation().evalRPN(expr) == expected

        where:
        expr                       | expected
        ["2", "1", "+", "3", "*"]  | 9
        ["4", "13", "5", "/", "+"] | 6
        ["9", "2", "-"]            | 7
    }

}
