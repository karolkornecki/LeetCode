package pl.ksolutions.leetcode.algorithms.medium

import pl.ksolutions.leetcode.algorithms.adt.ListNode
import spock.lang.Specification

class Linked_List_CycleSpec extends Specification {

    def "Should return true because list has cycle - 1 node list"() {

        given:
        ListNode list = new ListNode(5)
        list.next = list

        when:
        boolean result = new Linked_List_Cycle().hasCycle(list)

        then:
        result
    }

    def "Should return true because of list has cycle - more nodes"() {

        given:
        ListNode list_2 = new ListNode(5)
        ListNode list_1 = new ListNode(5, list_2)
        ListNode list_0 = new ListNode(5, list_1)
        list_2.next = list_0

        when:
        boolean result = new Linked_List_Cycle().hasCycle(list_0)

        then:
        result
    }

    def "Should return false because list does not have cycle"() {

        expect:
        !new Linked_List_Cycle().hasCycle(new ListNode(5, new ListNode(6, new ListNode(7))))
    }
}
