package com.interview.dp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CoinChangeTest {

    private final CoinChange solution = new CoinChange();

    @Test
    void findsMinimumCoinsForReachableAmount() {
        assertEquals(3, solution.coinChange(new int[]{1, 2, 5}, 11));
    }

    @Test
    void returnsMinusOneWhenAmountUnreachable() {
        assertEquals(-1, solution.coinChange(new int[]{2}, 3));
    }

    @Test
    void returnsZeroForZeroAmount() {
        assertEquals(0, solution.coinChange(new int[]{1, 2, 5}, 0));
    }
}
