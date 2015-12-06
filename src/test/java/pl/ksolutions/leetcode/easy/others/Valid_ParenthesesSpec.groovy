package pl.ksolutions.leetcode.easy.others

import org.junit.Assert
import spock.lang.Specification


class Valid_ParenthesesSpec extends Specification {

    def "Should return true, because of #a valid parentheses string"(a, _) {

        when:
        boolean result = new Valid_Parentheses().isValid(a)

        then:
        Assert.assertTrue(result)

        where:
        a        | _
        "{}"     | _
        "()[]{}" | _
    }

    def "Should return false, because of #a invalid parentheses string"(a, _) {

        when:
        boolean result = new Valid_Parentheses().isValid(a)

        then:
        Assert.assertFalse(result)

        where:
        a      | _
        "(]"   | _
        "([)]" | _
    }
}
