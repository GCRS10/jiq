package com.interview.dp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonSubsequenceTest {

    private final LongestCommonSubsequence solution = new LongestCommonSubsequence();

    @Test
    void findsCommonSubsequenceLength() {
        assertEquals(3, solution.longestCommonSubsequence("abcde", "ace"));
    }

    @Test
    void returnsZeroForNoCommonCharacters() {
        assertEquals(0, solution.longestCommonSubsequence("abc", "xyz"));
    }
}
