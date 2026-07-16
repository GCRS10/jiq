package com.interview.dp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {

    private final Fibonacci solution = new Fibonacci();

    @Test
    void computesKnownValuesMemoized() {
        assertEquals(0, solution.fibMemoized(0));
        assertEquals(1, solution.fibMemoized(1));
        assertEquals(55, solution.fibMemoized(10));
    }

    @Test
    void computesKnownValuesIterative() {
        assertEquals(0, solution.fibIterative(0));
        assertEquals(1, solution.fibIterative(1));
        assertEquals(55, solution.fibIterative(10));
    }
}
