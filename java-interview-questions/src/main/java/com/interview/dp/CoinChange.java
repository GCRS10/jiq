package com.interview.dp;

import java.util.Arrays;

/**
 * Problem: Given coin denominations and a target amount, return the fewest
 * number of coins needed to make that amount, or -1 if it can't be made.
 * e.g. coins = [1,2,5], amount = 11 -> 3 (5+5+1)
 *
 * Approach: Bottom-up DP. dp[a] = minimum coins to make amount a. Base case
 * dp[0] = 0. For each amount from 1..target, try every coin and take the
 * best (dp[a - coin] + 1) over all coins that fit.
 *
 * Time:  O(amount * number of coin denominations)
 * Space: O(amount)
 */
public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1); // sentinel for "unreachable"
        dp[0] = 0;

        for (int a = 1; a <= amount; a++) {
            for (int coin : coins) {
                if (coin <= a) {
                    dp[a] = Math.min(dp[a], dp[a - coin] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        CoinChange solution = new CoinChange();
        System.out.println(solution.coinChange(new int[]{1, 2, 5}, 11));
    }
}
