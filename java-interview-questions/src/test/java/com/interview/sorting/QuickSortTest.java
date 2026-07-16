package com.interview.sorting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class QuickSortTest {

    private final QuickSort solution = new QuickSort();

    @Test
    void sortsUnorderedArray() {
        int[] arr = {5, 2, 9, 1, 5, 6};
        solution.sort(arr);
        assertArrayEquals(new int[]{1, 2, 5, 5, 6, 9}, arr);
    }

    @Test
    void handlesAlreadySortedArray() {
        int[] arr = {1, 2, 3, 4};
        solution.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4}, arr);
    }
}
