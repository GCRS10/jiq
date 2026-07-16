package com.interview.arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TwoSumTest {

    private final TwoSum solution = new TwoSum();

    @Test
    void findsPairThatSumsToTarget() {
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    void findsPairNotAtStartOfArray() {
        assertArrayEquals(new int[]{1, 2}, solution.twoSum(new int[]{3, 2, 4}, 6));
    }

    @Test
    void throwsWhenNoSolutionExists() {
        assertThrows(IllegalArgumentException.class, () -> solution.twoSum(new int[]{1, 2}, 100));
    }
}
