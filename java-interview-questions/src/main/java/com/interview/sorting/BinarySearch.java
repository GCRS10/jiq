package com.interview.sorting;

/**
 * Problem: Given a sorted array and a target value, return the index of the
 * target, or -1 if it is not present.
 *
 * Approach: Classic binary search — repeatedly halve the search space by
 * comparing the target to the middle element.
 *
 * Time:  O(log n)
 * Space: O(1)
 */
public class BinarySearch {

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch solution = new BinarySearch();
        System.out.println(solution.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }
}
