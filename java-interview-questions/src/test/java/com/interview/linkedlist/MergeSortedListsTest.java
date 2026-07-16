package com.interview.linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MergeSortedListsTest {

    private final MergeSortedLists solution = new MergeSortedLists();

    @Test
    void mergesTwoSortedLists() {
        ListNode l1 = ListNode.fromArray(new int[]{1, 2, 4});
        ListNode l2 = ListNode.fromArray(new int[]{1, 3, 4});
        ListNode merged = solution.merge(l1, l2);
        assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4}, merged.toArray());
    }

    @Test
    void handlesOneEmptyList() {
        ListNode l1 = null;
        ListNode l2 = ListNode.fromArray(new int[]{1, 2, 3});
        ListNode merged = solution.merge(l1, l2);
        assertArrayEquals(new int[]{1, 2, 3}, merged.toArray());
    }
}
