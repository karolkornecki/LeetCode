package pl.ksolutions.leetcode.algorithms.easy.arrays

import org.junit.Assert
import spock.lang.Specification

class Plus_OneTest extends Specification {

    def "Should add one to number"(int[] expected, int[] digits) {

        when:
        int[] result = new Plus_One().plusOne(digits)

        then:
        Assert.assertArrayEquals(expected, result)

        where:
        expected     | digits
        [2]          | [1]
        [1, 5]       | [1, 4]
        [1, 0]       | [9]
        [1, 0, 0, 0] | [9, 9, 9]
        [1, 2, 6]    | [1, 2, 5]
        [9, 7, 0]    | [9, 6, 9]
    }
}
