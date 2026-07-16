package com.interview.strings;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeCheckTest {

    private final PalindromeCheck solution = new PalindromeCheck();

    @Test
    void recognizesPalindromeWithPunctuationAndCase() {
        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void rejectsNonPalindrome() {
        assertFalse(solution.isPalindrome("race a car"));
    }

    @Test
    void treatsEmptyStringAsPalindrome() {
        assertTrue(solution.isPalindrome(""));
    }
}
