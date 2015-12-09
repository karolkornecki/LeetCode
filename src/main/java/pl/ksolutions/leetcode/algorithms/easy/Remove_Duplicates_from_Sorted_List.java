package pl.ksolutions.leetcode.algorithms.easy;

import org.junit.Assert;
import pl.ksolutions.leetcode.algorithms.structures.ListNode;

/**
 * Difficulty: Easy
 * <p>
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * <p>
 * For example,
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3.
 *
 * @author Karol Kornecki
 */
public class Remove_Duplicates_from_Sorted_List {

    public static void main(String[] args) {
        Assert.assertEquals("321", new Remove_Duplicates_from_Sorted_List().deleteDuplicates(new ListNode(3, new ListNode(3, new ListNode(3, new ListNode(2, new ListNode(2, new ListNode(1, new ListNode(1, null)))))))).toString());
        Assert.assertEquals("3210", new Remove_Duplicates_from_Sorted_List().deleteDuplicates(new ListNode(3, new ListNode(3, new ListNode(3, new ListNode(2, new ListNode(2, new ListNode(1, new ListNode(1, new ListNode(0, null))))))))).toString());

    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode current = head;
        ListNode node = current;
        while (current != null) {
            if (current.val != node.val) {
                node.next = current;
                node = node.next;
            }
            current = current.next;
        }
        node.next = null;
        return head;
    }
}
