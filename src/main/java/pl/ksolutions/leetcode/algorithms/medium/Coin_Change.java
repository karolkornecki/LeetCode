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
        int[] dp = new int[amount + 1];
        for (int i = 0; i < dp.length; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    int current = dp[i - coins[j]];
                    if (current != Integer.MAX_VALUE) {
                        dp[i] = Math.min(current + 1, dp[i]);
                    }
                }
            }
        }
        if (dp[dp.length - 1] == Integer.MAX_VALUE) {
            return -1;
        }
        return dp[dp.length - 1];
    }
}
