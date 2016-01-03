package pl.ksolutions.leetcode.algorithms.easy

import spock.lang.Specification

class Count_PrimesSpec extends Specification {

    def "Should return amount of prime number less than n"(int n, int expected) {

        expect:
        new Count_Primes().countPrimes(n) == expected

        where:
        n  | expected
        42 | 13
        2  | 0
        1  | 0
        0  | 0
        3  | 1
    }

}
