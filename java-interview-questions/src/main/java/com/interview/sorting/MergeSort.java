package com.interview.sorting;

/**
 * Problem: Implement MergeSort to sort an array of integers.
 *
 * Approach: Classic divide-and-conquer — recursively split the array in
 * half, sort each half, then merge the two sorted halves back together
 * using an auxiliary buffer.
 *
 * Time:  O(n log n) in all cases
 * Space: O(n) for the auxiliary merge buffer
 */
public class MergeSort {

    public void sort(int[] arr) {
        if (arr.length < 2) return;
        int[] buffer = new int[arr.length];
        mergeSort(arr, buffer, 0, arr.length - 1);
    }

    private void mergeSort(int[] arr, int[] buffer, int left, int right) {
        if (left >= right) return;
        int mid = left + (right - left) / 2;
        mergeSort(arr, buffer, left, mid);
        mergeSort(arr, buffer, mid + 1, right);
        merge(arr, buffer, left, mid, right);
    }

    private void merge(int[] arr, int[] buffer, int left, int mid, int right) {
        System.arraycopy(arr, left, buffer, left, right - left + 1);

        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (buffer[i] <= buffer[j]) {
                arr[k++] = buffer[i++];
            } else {
                arr[k++] = buffer[j++];
            }
        }
        while (i <= mid) {
            arr[k++] = buffer[i++];
        }
        while (j <= right) {
            arr[k++] = buffer[j++];
        }
    }

    public static void main(String[] args) {
        MergeSort solution = new MergeSort();
        int[] arr = {5, 2, 9, 1, 5, 6};
        solution.sort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
}
