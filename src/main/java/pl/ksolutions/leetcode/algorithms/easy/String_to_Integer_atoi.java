package pl.ksolutions.leetcode.algorithms.easy;

/**
 * Difficulty: Easy
 * <p>
 * Implement atoi to convert a string to an integer.
 * <p>
 * Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.
 * <p>
 * Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.
 * <p>
 * Update (2015-02-10):
 * The signature of the C++ function had been updated. If you still see your function signature accepts a const char * argument, please click the reload button to reset your code definition.
 * <p>
 * spoilers alert... click to show requirements for atoi.
 * Requirements for atoi:
 * <p>
 * The function first discards as many whitespace characters as necessary until the first non-whitespace character is found. Then, starting from this character, takes an optional initial plus or minus sign followed by as many numerical digits as possible, and interprets them as a numerical value.
 * <p>
 * The string can contain additional characters after those that form the integral number, which are ignored and have no effect on the behavior of this function.
 * <p>
 * If the first sequence of non-whitespace characters in str is not a valid integral number, or if no such sequence exists because either str is empty or it contains only whitespace characters, no conversion is performed.
 * <p>
 * If no valid conversion could be performed, a zero value is returned. If the correct value is out of the range of representable values, INT_MAX (2147483647) or INT_MIN (-2147483648) is returned.
 *
 * @author Karol Kornecki
 */
public class String_to_Integer_atoi {

    public int myAtoi(String str) {
        if (str == null) {
            return 0;
        }
        boolean started = false;
        boolean negative = false;
        long number = 0;
        for (int i = 0; i < str.length(); i++) {
            if (started) {
                if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                    break;
                } else {
                    if (number == 0) {
                        number = str.charAt(i) - 48;
                    } else {
                        number *= 10;
                        number += (str.charAt(i) - 48);
                        if (negative && number * (-1) <= Integer.MIN_VALUE) {
                            return Integer.MIN_VALUE;
                        } else if (number > Integer.MAX_VALUE) {
                            return Integer.MAX_VALUE;
                        }
                    }
                }
            } else {
                if (str.charAt(i) == ' ') {
                    continue;
                }
                if (str.charAt(i) == '-') {
                    started = true;
                    negative = true;
                    continue;
                }
                if (str.charAt(i) == '+') {
                    started = true;
                    continue;
                }
                if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                    return 0;
                }
                started = true;
                number = str.charAt(i) - 48;
            }
        }

        number = negative ? number * (-1) : number;
        return number > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (number < Integer.MIN_VALUE ? Integer.MIN_VALUE : number);
    }
}
