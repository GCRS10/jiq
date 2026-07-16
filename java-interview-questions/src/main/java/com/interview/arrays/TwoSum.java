package com.interview.arrays;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem: Given an array of integers and a target, return the indices of the
 * two numbers that add up to the target. Assume exactly one solution exists,
 * and you may not use the same element twice.
 *
 * Approach: Single pass using a HashMap from value -> index. For each
 * element, check whether (target - element) has already been seen.
 *
 * Time:  O(n)
 * Space: O(n)
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                return new int[]{seen.get(complement), i};
            }
            seen.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] result = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
