package com.interview.arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RotateArrayTest {

    private final RotateArray solution = new RotateArray();

    @Test
    void rotatesArrayByKSteps() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        solution.rotate(nums, 3);
        assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, nums);
    }

    @Test
    void handlesKLargerThanArrayLength() {
        int[] nums = {1, 2, 3};
        solution.rotate(nums, 4); // equivalent to rotating by 1
        assertArrayEquals(new int[]{3, 1, 2}, nums);
    }
}
