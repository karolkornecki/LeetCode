package pl.ksolutions.leetcode.algorithms.medium

import pl.ksolutions.leetcode.algorithms.adt.ListNode
import spock.lang.Specification

class Sort_ListSpec extends Specification {


    def "Should sort single linked list"(ListNode list, String expected) {

        expect:
        new Sort_List().sortList(list).toString() == expected

        where:
        list                                                                                                 | expected
        new ListNode(5, new ListNode(4, new ListNode(2, new ListNode(3, new ListNode(7, new ListNode(8)))))) | "234578"
        new ListNode(4)                                                                                      | "4"
    }

    def "Should return null when list passed to sort is null"(ListNode list, String expected) {

        expect:
        new Sort_List().sortList(list) == expected

        where:
        list | expected
        null | null
    }
}
