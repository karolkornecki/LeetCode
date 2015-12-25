package pl.ksolutions.leetcode.algorithms.easy

import spock.lang.Specification


class Isomorphic_StringsSpec extends Specification {

    def "Should determine if two string are isomorphic"(String s, String t, boolean expected) {

        when:
        boolean result = new Isomorphic_Strings().isIsomorphic(s, t)

        then:
        result == expected

        where:
        s       | t       | expected
        "asda"  | "sd"    | false
        "title" | "paper" | true
        "add"   | "egg"   | true
        "ab"    | "aa"    | false
        "aa"    | "ab"    | false
    }
}
