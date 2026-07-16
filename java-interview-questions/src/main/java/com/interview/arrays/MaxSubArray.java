package com.interview.arrays;

/**
 * Problem: Given an integer array, find the contiguous subarray (containing
 * at least one number) which has the largest sum, and return that sum.
 * (LeetCode "Maximum Subarray")
 *
 * Approach: Kadane's Algorithm. Track the best sum ending at the current
 * index (currentSum) and the best sum seen so far (maxSum). At each step,
 * either extend the previous subarray or start a new one at the current
 * element, whichever is larger.
 *
 * Time:  O(n)
 * Space: O(1)
 */
public class MaxSubArray {

    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }
        int currentSum = nums[0];
        int maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        MaxSubArray solution = new MaxSubArray();
        System.out.println(solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
