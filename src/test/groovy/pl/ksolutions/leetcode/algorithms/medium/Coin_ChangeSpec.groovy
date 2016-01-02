package pl.ksolutions.leetcode.algorithms.medium

import spock.lang.Specification

class Coin_ChangeSpec extends Specification {

    def "Should return minimum number of coins to make change"(int[] coins, int amount, int expected) {

        when:
        int result = new Coin_Change().coinChange(coins, amount);

        then:
        result == expected

        where:
        coins     | amount | expected
//        [1, 2, 5] | 13     | 4
//        [5, 7]    | 9      | -1
//        []        | 7      | -1
//        [1, 2, 5] | 0      | 0
        [3, 5]    | 16     | 4
    }
}
