package pl.ksolutions.leetcode.algorithms.easy.lists;

import pl.ksolutions.leetcode.algorithms.structures.ListNode;

/**
 * Difficulty: Easy
 * <p>
 * Given a singly linked list, determine if it is a palindrome.
 * <p>
 * Follow up:
 * Could you do it in O(n) time and O(1) space?
 *
 * @author Karol Kornecki
 */
public class Palindrome_Linked_List {

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }
        String[] s = trace(head).split("#");

        int i = 0;
        int j = s.length - 1;
        while (i <= j) {
            if (!s[i++].equals(s[j--])) {
                return false;
            }
        }
        return true;
    }

    private String trace(ListNode head) {
        if (head == null) {
            return "";
        }
        return head.val + "#" + trace(head.next);
    }


}
