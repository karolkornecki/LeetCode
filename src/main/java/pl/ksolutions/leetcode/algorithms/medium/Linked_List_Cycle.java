package pl.ksolutions.leetcode.algorithms.medium;

import pl.ksolutions.leetcode.algorithms.adt.ListNode;

/**
 * Difficulty: Medium
 * <p>
 * Given a linked list, determine if it has a cycle in it.
 * <p>
 * Follow up:
 * Can you solve it without using extra space?
 *
 * @author Karol Kornecki
 */
public class Linked_List_Cycle {

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        if (head.next == head) {
            return true;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
