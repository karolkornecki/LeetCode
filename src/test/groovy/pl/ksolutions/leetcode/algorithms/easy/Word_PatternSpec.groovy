package pl.ksolutions.leetcode.algorithms.easy

import spock.lang.Specification


class Word_PatternSpec extends Specification {

    def "Should return true if string match the pattern, otherwise return false"() {

        when:
        boolean result = new Word_Pattern().wordPattern(pattern, string)

        then:
        result == expected

        where:
        pattern | string             | expected
        "abba"  | "dog cat cat dog"  | true
        "abba"  | "dog cat cat fish" | false
        "aaaa"  | "dog cat cat dog"  | false
        "abba"  | "dog dog dog dog"  | false

    }
}
