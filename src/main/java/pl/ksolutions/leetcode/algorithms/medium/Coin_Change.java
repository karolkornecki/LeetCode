package pl.ksolutions.leetcode.algorithms.medium;

/**
 * Difficulty: Medium
 * <p>
 * You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
 * <p>
 * Example 1:
 * coins = [1, 2, 5], amount = 11
 * return 3 (11 = 5 + 5 + 1)
 * <p>
 * Example 2:
 * coins = [2], amount = 3
 * return -1.
 * <p>
 * Note:
 * You may assume that you have an infinite number of each kind of coin.
 *
 * @author Karol Kornecki
 */
public class Coin_Change {


    public int coinChange(int[] coins, int amount) {
        if (amount <= 0) {
            return 0;
        }
        return 0;

    }


//
//    private int coinChangePossibleWays(int[] coins, int amount) {
//        int r = change(coins, amount);
//        return r == 0 ? -1 : r;
//    }
//
//    private int change(int[] coins, int amount) {
//        if (amount == 0) {
//            return 1;
//        }
//        if (amount < 0) {
//            return 0;
//        }
//        if (coins.length == 0 && amount > 0) {
//            return 0;
//        }
//        return coinChangePossibleWays(Arrays.copyOfRange(coins, 0, coins.length - 1), amount) + coinChangePossibleWays(coins, amount - coins[coins.length - 1]);
//
//    }
}
