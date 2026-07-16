package com.interview.dp;

/**
 * Problem: Given two strings, find the length of their longest common
 * subsequence (LCS) — the longest sequence of characters that appears in
 * both strings in the same relative order (not necessarily contiguous).
 * e.g. "abcde" and "ace" -> 3 ("ace")
 *
 * Approach: Bottom-up DP table where dp[i][j] is the LCS length of the
 * first i characters of s1 and the first j characters of s2. If the
 * characters match, extend the diagonal; otherwise take the best of
 * skipping a character from either string.
 *
 * Time:  O(m * n)
 * Space: O(m * n)
 */
public class LongestCommonSubsequence {

    public int longestCommonSubsequence(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        LongestCommonSubsequence solution = new LongestCommonSubsequence();
        System.out.println(solution.longestCommonSubsequence("abcde", "ace"));
    }
}
