package pl.ksolutions.leetcode.easy;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * Difficulty: Easy
 * <p>
 * Given numRows, generate the first numRows of Pascal's triangle.
 * <p>
 * For example, given numRows = 5,
 * Return
 * <p>
 * [
 * [1],
 * [1,1],
 * [1,2,1],
 * [1,3,3,1],
 * [1,4,6,4,1]
 * ]
 *
 * @author Karol Kornecki
 */
public class Pascals_Triangle {

    public static void main(String[] args) {
        List<Integer> r1 = new ArrayList<>();
        r1.add(1);

        List<Integer> r2 = new ArrayList<>();
        r2.add(1);
        r2.add(1);

        List<Integer> r3 = new ArrayList<>();
        r3.add(1);
        r3.add(2);
        r3.add(1);

        List<Integer> r4 = new ArrayList<>();
        r4.add(1);
        r4.add(3);
        r4.add(3);
        r4.add(1);

        List<Integer> r5 = new ArrayList<>();
        r5.add(1);
        r5.add(4);
        r5.add(5);
        r5.add(4);
        r5.add(1);

        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(r1);
        triangle.add(r2);
        triangle.add(r3);
        triangle.add(r4);
        triangle.add(r5);

        Assert.assertEquals(triangle, new Pascals_Triangle().generate(5));
    }


    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            if (i == 0) {
                triangle.add(row(i, null));
            } else {
                triangle.add(row(i, triangle.get(i - 1)));
            }

        }
        return triangle;
    }

    private List<Integer> row(int i, List<Integer> upperRow) {
        List<Integer> row = new ArrayList<>();
        for (int j = 0; j < i + 1; j++) {
            //first row
            if (upperRow == null) {
                row.add(1);
                return row;
            }
            //remaining rows
            if (j == 0 || j == i) {
                row.add(1);
            } else {
                row.add(upperRow.get(j - 1) + upperRow.get(j));
            }
        }
        return row;
    }
}
