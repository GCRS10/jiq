package com.interview.sorting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {

    private final BinarySearch solution = new BinarySearch();

    @Test
    void findsExistingTarget() {
        assertEquals(4, solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }

    @Test
    void returnsMinusOneWhenNotFound() {
        assertEquals(-1, solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }
}
