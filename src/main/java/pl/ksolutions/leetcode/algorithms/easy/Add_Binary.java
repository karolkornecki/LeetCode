package pl.ksolutions.leetcode.algorithms.easy;

/**
 * Difficulty: Easy
 * <p>
 * Given two binary strings, return their sum (also a binary string).
 * <p>
 * For example,
 * a = "11"
 * b = "1"
 * Return "100".
 *
 * @author Karol Kornecki
 */
public class Add_Binary {

    public String addBinary(String a, String b) {
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }
        int p = Math.abs(a.length() - b.length());
        if (a.length() < b.length()) {
            a = paddingZeros(a, p);
        } else if (a.length() > b.length()) {
            b = paddingZeros(b, p);
        }
        boolean carryOne = false;
        String r = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            if (carryOne) {
                if (a.charAt(i) == '0' && b.charAt(i) == '0') {
                    r = "1" + r;
                    carryOne = false;
                } else if (a.charAt(i) == '1' && b.charAt(i) == '1') {
                    r = "1" + r;
                } else {
                    r = "0" + r;
                }
            } else {
                if (a.charAt(i) == '0' && b.charAt(i) == '0') {
                    r = "0" + r;
                } else if (a.charAt(i) == '1' && b.charAt(i) == '1') {
                    r = "0" + r;
                    carryOne = true;
                } else {
                    r = "1" + r;
                }
            }
        }
        return carryOne ? "1" + r : r;
    }

    private String paddingZeros(String a, int p) {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < p; i++) {
            b.append("0");
        }
        return b.append(a).toString();
    }
}
