package com.interview.linkedlist;

/**
 * Problem: Reverse a singly linked list, iteratively.
 * e.g. 1->2->3->4->5 -> 5->4->3->2->1
 *
 * Approach: Walk the list once, re-pointing each node's `next` to the
 * previous node instead of the following one.
 *
 * Time:  O(n)
 * Space: O(1)
 */
public class ReverseLinkedList {

    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ReverseLinkedList solution = new ReverseLinkedList();
        ListNode head = ListNode.fromArray(new int[]{1, 2, 3, 4, 5});
        ListNode reversed = solution.reverse(head);
        System.out.println(java.util.Arrays.toString(reversed.toArray()));
    }
}
