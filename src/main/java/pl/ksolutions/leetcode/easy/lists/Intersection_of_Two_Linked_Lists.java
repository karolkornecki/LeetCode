package pl.ksolutions.leetcode.easy.lists;

import org.junit.Assert;
import pl.ksolutions.leetcode.annotations.TimeLimitExceeded;
import pl.ksolutions.leetcode.structures.ListNode;

/**
 * Difficulty: Easy
 * <p>
 * Write a program to find the node at which the intersection of two singly linked lists begins.
 * <p>
 * For example, the following two linked lists:
 * <p>
 * A:          a1 → a2
 * ↘
 * c1 → c2 → c3
 * ↗
 * B:     b1 → b2 → b3
 * <p>
 * begin to intersect at node c1.
 * <p>
 * Notes:
 * <p>
 * If the two linked lists have no intersection at all, return null.
 * The linked lists must retain their original structure after the function returns.
 * You may assume there are no cycles anywhere in the entire linked structure.
 * Your code should preferably run in O(n) time and use only O(1) memory.
 *
 * @author Karol Kornecki
 */
public class Intersection_of_Two_Linked_Lists {

    public static void main(String[] args) {
        ListNode c1 = new ListNode(111);
        ListNode c2 = new ListNode(222);
        ListNode c3 = new ListNode(333);
        c1.next = c2;
        c2.next = c3;


        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        a1.next = a2;
        a2.next = c1;

        ListNode b1 = new ListNode(11);
        ListNode b2 = new ListNode(22);
        ListNode b3 = new ListNode(33);
        b1.next = b2;
        b2.next = b3;
        b3.next = c1;

        Assert.assertSame(c1, new Intersection_of_Two_Linked_Lists().getIntersectionNode(a1, b1));
        Assert.assertEquals(null, new Intersection_of_Two_Linked_Lists().getIntersectionNode(null, null));
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        int lengthA = length(headA);
        int lengthB = length(headB);

        if (lengthA > lengthB) {
            headA = move(headA, lengthA - lengthB);
        } else if (lengthA < lengthB) {
            headB = move(headB, lengthB - lengthA);
        }
        while (headA != headB) {
            if (headA == null || headB == null) {
                return null;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return headA; //or headB;
    }

    private ListNode move(ListNode n, int i) {
        while (i != 0) {
            n = n.next;
            i--;
        }
        return n;
    }

    private int length(ListNode n) {
        int l = 0;
        while (n != null) {
            l++;
            n = n.next;
        }
        return l;
    }

    private int recursiveLength(ListNode n) {
        if (n == null) {
            return 0;
        }
        return 1 + recursiveLength(n.next);
    }

    //--------------------------------------------------------------------

    //best solution not mine.
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode a = headA;
        ListNode b = headB;
        while (a != b) {
            a = a != null ? a.next : headB;
            b = b != null ? b.next : headA;
        }
        return a;
    }

    //-------------------------------------------------------------------

    @TimeLimitExceeded // my naive solution
    public ListNode getIntersectionNode3(ListNode headA, ListNode headB) {
        while (headA != null) {
            if (exist(headB, headA)) {
                return headA;
            }
            headA = headA.next;
        }
        return null;
    }

    private boolean exist(ListNode headB, ListNode headA) {
        while (headB != null) {
            if (headA == headB) {
                return true;
            }
            headB = headB.next;
        }
        return false;
    }
}
