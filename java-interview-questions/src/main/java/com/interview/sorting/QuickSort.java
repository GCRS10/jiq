package com.interview.sorting;

/**
 * Problem: Implement QuickSort to sort an array of integers in place.
 *
 * Approach: Lomuto partition scheme. Pick the last element of the range as
 * the pivot, partition the range so smaller elements are to the left and
 * larger to the right, then recurse on each side.
 *
 * Time:  O(n log n) average, O(n^2) worst case (already-sorted input with a
 *        naive pivot choice)
 * Space: O(log n) recursion stack average
 */
public class QuickSort {

    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        QuickSort solution = new QuickSort();
        int[] arr = {5, 2, 9, 1, 5, 6};
        solution.sort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }
}
