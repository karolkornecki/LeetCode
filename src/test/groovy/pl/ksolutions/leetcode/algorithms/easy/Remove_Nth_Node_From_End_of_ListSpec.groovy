package pl.ksolutions.leetcode.algorithms.easy

import pl.ksolutions.leetcode.algorithms.adt.ListNode
import spock.lang.Specification

class Remove_Nth_Node_From_End_of_ListSpec extends Specification {

    def "Should remove Nth node from the end of the list"(ListNode list, int n, String expected) {

        when:
        ListNode result = new Remove_Nth_Node_From_End_of_List().removeNthFromEnd(list, n);

        then:
        result.toString() == expected.toString()

        where:
        list                                                                                | n | expected
        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))) | 2 | "1235"
        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))) | 1 | "1234"
        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))) | 3 | "1245"
        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))) | 4 | "1345"
        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))) | 5 | "2345"
    }

    def "Should remove Nth node from the end of the list [2]"(ListNode list, int n, String expected) {

        when:
        ListNode result = new Remove_Nth_Node_From_End_of_List().removeNthFromEnd2(list, n);

        then:
        result.toString() == expected.toString()

        where:
        list                                                                                | n | expected
        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))) | 2 | "1235"
        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))) | 1 | "1234"
        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))) | 3 | "1245"
        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))) | 4 | "1345"
        new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))) | 5 | "2345"
    }
}
