package pl.ksolutions.leetcode.algorithms.medium

import spock.lang.Specification

class Generate_ParenthesesSpec extends Specification {


    def "Should generate all valid combinations of parentheses"(int n, String[] expected) {

        expect:
        new Generate_Parentheses().generateParenthesis(n) == expected

        where:
        n | expected
        3 | ["((()))", "(()())", "(())()", "()(())", "()()()"]
    }
}
