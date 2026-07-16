package com.interview.dp;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem: Compute the n-th Fibonacci number (F(0)=0, F(1)=1,
 * F(n)=F(n-1)+F(n-2)).
 *
 * Approach: Top-down dynamic programming with memoization to avoid the
 * exponential blowup of the naive recursive solution. A bottom-up iterative
 * variant with O(1) space is included for comparison.
 *
 * Time:  O(n)
 * Space: O(n) for the memoized version, O(1) for the iterative version
 */
public class Fibonacci {

    private final Map<Integer, Long> memo = new HashMap<>();

    public long fibMemoized(int n) {
        if (n <= 1) return n;
        if (memo.containsKey(n)) return memo.get(n);
        long result = fibMemoized(n - 1) + fibMemoized(n - 2);
        memo.put(n, result);
        return result;
    }

    public long fibIterative(int n) {
        if (n <= 1) return n;
        long prev = 0;
        long curr = 1;
        for (int i = 2; i <= n; i++) {
            long next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    public static void main(String[] args) {
        Fibonacci solution = new Fibonacci();
        System.out.println(solution.fibMemoized(30));
        System.out.println(solution.fibIterative(30));
    }
}
