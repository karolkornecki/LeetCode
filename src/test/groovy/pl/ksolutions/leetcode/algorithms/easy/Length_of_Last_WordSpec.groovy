package pl.ksolutions.leetcode.algorithms.easy

import spock.lang.Specification

class Length_of_Last_WordSpec extends Specification {

    def "Should return valid length of last word in string"(String s, int expectedLength) {

        when:
        int result = new Length_of_Last_Word().lengthOfLastWord(s)

        then:
        result == expectedLength

        where:
        s                         | expectedLength
        "Hello world"             | 5
        ""                        | 0
        null                      | 0
        "aaaaa dddd dddd sss "    | 3
        " dfs    fsf sss ffggtt5" | 6
        "aa"                      | 2
        " ffff  "                 | 4
    }
}
