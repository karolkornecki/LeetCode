package pl.ksolutions.leetcode.easy;

import org.junit.Assert;

/**
 * Difficulty: Easy
 * <p/>
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 * <p/>
 * Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should become 1 -> 2 -> 4 after calling your function.
 *
 * @author Karol Kornecki
 */
public class Delete_Node_in_a_Linked_List {

    public static void main(String[] args) {
        ListNode n3 = new ListNode(3, new ListNode(4, null));
        ListNode root = new ListNode(1, new ListNode(2, n3));
        new Delete_Node_in_a_Linked_List().deleteNode(n3);
        Assert.assertEquals("124", root.toString());
    }

    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) {
            return;
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }

    private static class ListNode {
        int val;
        ListNode next;

        public ListNode(int x, ListNode n) {
            val = x;
            next = n;
        }

        @Override
        public String toString() {
            if (next == null) {
                return "" + val;
            }
            return val + next.toString();
        }
    }
}
