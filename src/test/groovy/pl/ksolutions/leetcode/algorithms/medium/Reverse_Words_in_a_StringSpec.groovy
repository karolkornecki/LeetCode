package pl.ksolutions.leetcode.algorithms.medium

import spock.lang.Specification

class Reverse_Words_in_a_StringSpec extends Specification {

    def "Should reverse words in string"(String str, String expected) {

        expect:
        new Reverse_Words_in_a_String().reverseWords(str) == expected

        where:
        str                         | expected
        "the sky is blue"           | "blue is sky the"
        "   the  sky  is  blue    " | "blue is sky the"
        " "                         | ""
        null                        | null
    }

    def "Should reverse words in string 2"(String str, String expected) {

        expect:
        new Reverse_Words_in_a_String().reverseWords2(str) == expected

        where:
        str                         | expected
        "the sky is blue"           | "blue is sky the"
        "   the  sky  is  blue    " | "blue is sky the"
        " "                         | ""
        null                        | null
    }
}
