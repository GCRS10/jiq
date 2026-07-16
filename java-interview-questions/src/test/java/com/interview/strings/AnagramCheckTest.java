package com.interview.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnagramCheckTest {

    private final AnagramCheck solution = new AnagramCheck();

    @Test
    void recognizesAnagram() {
        assertTrue(solution.isAnagram("listen", "silent"));
    }

    @Test
    void rejectsDifferentLengthStrings() {
        assertFalse(solution.isAnagram("rat", "car"));
    }

    @Test
    void rejectsSameLengthNonAnagram() {
        assertFalse(solution.isAnagram("abc", "abd"));
    }
}
