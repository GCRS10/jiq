package com.interview.linkedlist;

/**
 * Simple singly-linked list node shared by the linked-list exercises.
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    /** Builds a list from an array, returning the head. */
    public static ListNode fromArray(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int v : values) {
            current.next = new ListNode(v);
            current = current.next;
        }
        return dummy.next;
    }

    /** Converts the list starting at this node into an array. */
    public int[] toArray() {
        int length = 0;
        for (ListNode n = this; n != null; n = n.next) {
            length++;
        }
        int[] result = new int[length];
        int i = 0;
        for (ListNode n = this; n != null; n = n.next) {
            result[i++] = n.val;
        }
        return result;
    }
}
