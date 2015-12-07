package pl.ksolutions.leetcode.algorithms.easy.others;

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
