package com.interview.arrays;

/**
 * Problem: Rotate an array to the right by k steps, in place.
 * e.g. [1,2,3,4,5,6,7], k=3 -> [5,6,7,1,2,3,4]
 *
 * Approach: Reverse the whole array, then reverse the first k elements,
 * then reverse the remaining n-k elements. Three linear passes, no extra
 * array needed.
 *
 * Time:  O(n)
 * Space: O(1)
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int tmp = nums[start];
            nums[start] = nums[end];
            nums[end] = tmp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        RotateArray solution = new RotateArray();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        solution.rotate(nums, 3);
        System.out.println(java.util.Arrays.toString(nums));
    }
}
