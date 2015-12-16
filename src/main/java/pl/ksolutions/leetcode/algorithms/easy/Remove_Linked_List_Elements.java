package pl.ksolutions.leetcode.algorithms.easy;

import pl.ksolutions.leetcode.algorithms.adt.ListNode;

/**
 * Difficulty: Easy
 * <p>
 * Remove all elements from a linked list of integers that have value val.
 * <p>
 * Example
 * Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
 * Return: 1 --> 2 --> 3 --> 4 --> 5
 *
 * @author Karol Kornecki
 */
public class Remove_Linked_List_Elements {

    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode guard = new ListNode(-1);
        guard.next = head;

        ListNode current = head;
        ListNode previous = guard;
        while (current != null) {
            if (current.val == val) {
                while (current != null && current.val == val) {
                    current = current.next;
                }
                previous.next = current;
            }
            previous = current;
            if (current != null) {
                current = current.next;
            }
        }
        return guard.next;
    }
}
