package pl.ksolutions.leetcode.algorithms.medium

import spock.lang.Specification

class Permutation_SequenceSpec extends Specification {

    def "Should return k-th permutations of sequence"() {

        when:
        String result = new Permutation_Sequence().getPermutation(n, k);

        then:
        result == expected

        where:
        n | k | expected
        3 | 6 | "123\n132\n213\n231\n312\n321"
        3 | 3 | "123\n132\n213"
        3 | 1 | "123"
        3 | 0 | ""
    }

}
