package pl.ksolutions.leetcode.algorithms.easy

import pl.ksolutions.leetcode.algorithms.adt.ListNode
import spock.lang.Specification


class Remove_Linked_List_ElementsSpec extends Specification {

    def "Should remove elements from list with given value"(ListNode list, int val, String expected) {

        when:
        ListNode result = new Remove_Linked_List_Elements().removeElements(list, val)

        then:
        result.toString() == expected

        where:
        list                                                                                                 | val | expected
        new ListNode(1, new ListNode(2, new ListNode(6, new ListNode(4, new ListNode(5, new ListNode(6)))))) | 6   | "1245"
        new ListNode(1, new ListNode(2))                                                                     | 1   | "2"
        new ListNode(2, new ListNode(1))                                                                     | 1   | "2"
        new ListNode(1, new ListNode(2, new ListNode(1)))                                                    | 2   | "11"
        new ListNode(1, new ListNode(2, new ListNode(1)))                                                    | 1   | "2"
        new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))))                                   | 1   | "22"
    }

    def "Should return null if all nodes contains value to remove"(ListNode list, int val, String expected) {

        when:
        ListNode result = new Remove_Linked_List_Elements().removeElements(list, val)

        then:
        result == expected

        where:
        list                             | val | expected
        null                             | 6   | null
        new ListNode(1)                  | 1   | null
        new ListNode(1, new ListNode(1)) | 1   | null
    }
}
