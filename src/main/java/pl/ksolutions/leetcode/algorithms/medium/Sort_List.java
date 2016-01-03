package pl.ksolutions.leetcode.algorithms.medium;

import pl.ksolutions.leetcode.algorithms.adt.ListNode;

/**
 * Difficulty: Medium
 * <p>
 * Sort a linked list in O(n log n) time using constant space complexity.
 * <p>
 * Subscribe to see which companies asked this question
 *
 * @author Karol Kornecki
 */
public class Sort_List {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        prev.next = null;
        ListNode left = sortList(head);
        ListNode right = sortList(slow);
        return merge(left, right);
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode guard = new ListNode(-1);
        ListNode current = guard;
        while (left != null && right != null) {
            if (left.val <= right.val) {
                current.next = left;
                left = left.next;
            } else {
                current.next = right;
                right = right.next;
            }
            current = current.next;
        }
        while (left != null) {
            current.next = left;
            left = left.next;
            current = current.next;
        }
        while (right != null) {
            current.next = right;
            right = right.next;
            current = current.next;
        }
        return guard.next;
    }
}
