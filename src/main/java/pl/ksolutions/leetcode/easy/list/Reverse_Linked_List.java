package pl.ksolutions.leetcode.easy.list;

import org.junit.Assert;
import pl.ksolutions.leetcode.structures.ListNode;

/**
 * Difficulty: Easy
 * <p/>
 * Reverse a singly linked list.
 * Hint:
 * <p/>
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 *
 * @author Karol Kornecki
 */
public class Reverse_Linked_List {

    public static void main(String[] args) {
        Assert.assertEquals("321", new Reverse_Linked_List().reverseList2(new ListNode(1, new ListNode(2, new ListNode(3, null)))).toString());
        Assert.assertEquals("654321", new Reverse_Linked_List().reverseList2(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, null))))))).toString());
    }

    //------- Recursive solutions
    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode tail = reverseList2(head.next);
        head.next.next = head;
        head.next = null;
        return tail;
    }

    //------- My first solution - not optimized
    public ListNode reverseList(ListNode head) {
        int size = size(head);

        ListNode current = head;
        for (int i = 0; i < size; i++) {
            ListNode toSwap = getNodeToSwap(current, size - 1 - (i * 2));
            swapNode(current, toSwap);
            current = current.next;
        }
        return head;
    }

    private ListNode getNodeToSwap(ListNode current, int i) {
        while (i > 0) {
            current = current.next;
            i--;
        }
        return current;
    }

    private void swapNode(ListNode head, ListNode toSwap) {
        int tmp = head.val;
        head.val = toSwap.val;
        toSwap.val = tmp;
    }

    private int size(ListNode head) {
        int size = 0;
        while (head != null) {
            head = head.next;
            size++;
        }
        return size;
    }
}
