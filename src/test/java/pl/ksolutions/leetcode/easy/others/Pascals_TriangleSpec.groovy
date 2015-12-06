package pl.ksolutions.leetcode.easy.others

import spock.lang.Specification

class Pascals_TriangleSpec extends Specification {

    def "Should generate correct Pascals Triangle"() {

        given:
        Pascals_Triangle sus = new Pascals_Triangle();

        when:
        def result = sus.generate(5)

        then:
        [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]] == result;
    }
}
