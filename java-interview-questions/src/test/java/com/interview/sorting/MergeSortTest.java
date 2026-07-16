package com.interview.sorting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortTest {

    private final MergeSort solution = new MergeSort();

    @Test
    void sortsUnorderedArray() {
        int[] arr = {5, 2, 9, 1, 5, 6};
        solution.sort(arr);
        assertArrayEquals(new int[]{1, 2, 5, 5, 6, 9}, arr);
    }

    @Test
    void handlesSingleElementArray() {
        int[] arr = {42};
        solution.sort(arr);
        assertArrayEquals(new int[]{42}, arr);
    }
}
