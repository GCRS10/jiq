package com.interview.linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ReverseLinkedListTest {

    private final ReverseLinkedList solution = new ReverseLinkedList();

    @Test
    void reversesList() {
        ListNode head = ListNode.fromArray(new int[]{1, 2, 3, 4, 5});
        ListNode reversed = solution.reverse(head);
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, reversed.toArray());
    }

    @Test
    void handlesNullHead() {
        assertNull(solution.reverse(null));
    }
}
