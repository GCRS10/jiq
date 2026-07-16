package com.interview.linkedlist;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DetectCycleTest {

    private final DetectCycle solution = new DetectCycle();

    @Test
    void detectsCycle() {
        ListNode head = ListNode.fromArray(new int[]{3, 2, 0, -4});
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head.next; // create cycle back into the list
        assertTrue(solution.hasCycle(head));
    }

    @Test
    void returnsFalseForAcyclicList() {
        ListNode head = ListNode.fromArray(new int[]{1, 2, 3});
        assertFalse(solution.hasCycle(head));
    }
}
