package com.interview.linkedlist;

/**
 * Problem: Merge two sorted linked lists into one sorted list by splicing
 * together their nodes.
 * e.g. 1->2->4 and 1->3->4 -> 1->1->2->3->4->4
 *
 * Approach: Use a dummy head and a tail pointer. Repeatedly attach the
 * smaller of the two current nodes, then advance that list. Append any
 * remaining tail once one list is exhausted.
 *
 * Time:  O(n + m)
 * Space: O(1) extra (reuses existing nodes)
 */
public class MergeSortedLists {

    public ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        tail.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }

    public static void main(String[] args) {
        MergeSortedLists solution = new MergeSortedLists();
        ListNode l1 = ListNode.fromArray(new int[]{1, 2, 4});
        ListNode l2 = ListNode.fromArray(new int[]{1, 3, 4});
        ListNode merged = solution.merge(l1, l2);
        System.out.println(java.util.Arrays.toString(merged.toArray()));
    }
}
