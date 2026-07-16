package com.interview.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestSubstringTest {

    private final LongestSubstring solution = new LongestSubstring();

    @Test
    void findsLongestSubstringWithRepeats() {
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    void handlesAllSameCharacters() {
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    void handlesEmptyString() {
        assertEquals(0, solution.lengthOfLongestSubstring(""));
    }
}
