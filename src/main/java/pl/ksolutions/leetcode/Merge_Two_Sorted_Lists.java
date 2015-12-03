package pl.ksolutions.leetcode;

/**
 * Difficulty: Easy
 * <p/>
 * Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
 *
 * @author Karol Kornecki
 */
public class Merge_Two_Sorted_Lists {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(1);
        new Merge_Two_Sorted_Lists().mergeTwoLists(l1, l2);
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode current = null;
        ListNode head = null;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                if (head == null) {
                    head = l1;
                    current = head;
                } else {
                    current.next = l1;
                    current = current.next;
                }
                l1 = l1.next;
            } else {
                if (head == null) {
                    head = l2;
                    current = head;
                } else {
                    current.next = l2;
                    current = current.next;
                }
                l2 = l2.next;
            }
        }
        while (l1 != null) {
            current.next = l1;
            current = current.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            current.next = l2;
            current = current.next;
            l2 = l2.next;
        }
        return head;
    }

    private static class ListNode {
        int val;
        ListNode next;

        public ListNode(int x) {
            val = x;
        }
    }
}
