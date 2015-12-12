package pl.ksolutions.leetcode.algorithms.easy;

import pl.ksolutions.leetcode.algorithms.adt.ListNode;

/**
 * Difficulty: Easy
 * <p>
 * Given a linked list, remove the nth node from the end of list and return its head.
 * <p>
 * For example,
 * <p>
 * Given linked list: 1->2->3->4->5, and n = 2.
 * <p>
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * <p>
 * Note:
 * Given n will always be valid.
 * Try to do this in one pass.
 *
 * @author Karol Kornecki
 */
public class Remove_Nth_Node_From_End_of_List {


    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        //guard to handle first element if needed
        ListNode guard = new ListNode(0);
        guard.next = head;
        ListNode fast = guard;
        ListNode slow = guard;

        int i = 0;
        //creating n-nodes gap, which means slow pointer will be n-1 places behind fast,
        // and when the fast pointer reaches the end of the list, slow pointer will be exactly the node behind the node to delete.
        while (i <= n) {
            fast = fast.next;
            i++;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return guard.next;
    }

    //my first solution but not optimal
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        if (head == null) {
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;

        int length = 0;

        while (fast != null) {
            fast = fast.next;
            length++;
        }

        if (n == length) {
            head = head.next;
            return head;
        }

        int slowLength = 0;
        while (slowLength < length - n - 1) {
            slow = slow.next;
            slowLength++;
        }
        slow.next = slow.next.next;
        return head;
    }
}
