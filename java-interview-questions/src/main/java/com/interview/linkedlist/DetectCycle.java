package com.interview.linkedlist;

/**
 * Problem: Determine whether a linked list has a cycle in it.
 *
 * Approach: Floyd's Cycle Detection (tortoise and hare). Move one pointer
 * one step at a time and another two steps at a time; if there is a cycle,
 * the fast pointer will eventually lap the slow pointer.
 *
 * Time:  O(n)
 * Space: O(1)
 */
public class DetectCycle {

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        DetectCycle solution = new DetectCycle();
        ListNode head = ListNode.fromArray(new int[]{3, 2, 0, -4});
        // manually create a cycle: tail -> second node
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.next = head.next;
        System.out.println(solution.hasCycle(head));
    }
}
