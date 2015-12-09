package pl.ksolutions.leetcode.algorithms.easy

import spock.lang.Specification


class Longest_Common_PrefixTest extends Specification {

    def "Should return longest common prefix"(String[] strs, String expected) {

        when:
        String result = new Longest_Common_Prefix().longestCommonPrefix(strs)

        then:
        expected == result

        where:
        strs                                                    | expected
        ['flower', 'flow', 'fleet']                             | "fl"
        ["abcdefg", "abcdfr", "abcd", "abcgt", "abc", "abcrxw"] | "abc"
        ["", ""]                                                | ""
    }
}
