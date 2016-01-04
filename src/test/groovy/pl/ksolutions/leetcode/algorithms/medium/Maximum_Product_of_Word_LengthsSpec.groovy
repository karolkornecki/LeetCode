package pl.ksolutions.leetcode.algorithms.medium

import spock.lang.Specification

class Maximum_Product_of_Word_LengthsSpec extends Specification {

    def "Should return maximum product of words length"(String[] words, int exptected) {

        expect:
        new Maximum_Product_of_Word_Lengths().maxProduct(words) == exptected

        where:
        words                                           | exptected
        ["acdeb"]                                       | 0
        ["abcw", "baz", "foo", "bar", "xtfn", "abcdef"] | 16
        ["a", "ab", "abc", "d", "cd", "bcd", "abcd"]    | 4
        ["a", "aa", "aaa", "aaaa"]                      | 0
    }
}
