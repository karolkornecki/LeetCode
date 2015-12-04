package pl.ksolutions.leetcode;

/**
 * Difficulty: Easy
 * <p/>
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * <p/>
 * For example:
 * <p/>
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 * <p/>
 * Follow up:
 * Could you do it without any loop/recursion in O(1) runtime?
 *
 * @author Karol Kornecki
 */
public class Add_Digits {

    public static void main(String[] args) {
        System.out.print(new Add_Digits().addDigits2(38));
    }

    public int addDigits(int num) {
        int s = sum(num);
        if (s / 10 == 0) {
            return s;
        }
        return addDigits(s);
    }

    private int sum(int n) {
        if (n / 10 == 0) {
            return n;
        }
        return (n / 10) + sum(n % 10);
    }

    public int addDigits2(int num) {
        if (num <= 9) {
            return num;
        }
        return num % 9;
    }
}
