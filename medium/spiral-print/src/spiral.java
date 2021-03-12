import java.util.ArrayList;

class Solution {
    static ArrayList<Integer> spiral_print(int[][] matrix, int r, int c) {
        ArrayList<Integer> ans = new ArrayList<Integer>();

        int row_position = 0;
        int column_position = 0;
        int row_qty = c;
        int col_qty = r;

        while (true) {
            for (int i = 0; i < row_qty; i++) {
                ans.add(matrix[row_position][column_position]);
                if (i == row_qty - 1) {
                    col_qty--;
                    row_position++;
                } else {
                    column_position++;
                }
            }

            if (row_qty == 0 || col_qty == 0) {
                return ans;
            }

            for (int i = 0; i < col_qty; i++) {
                ans.add(matrix[row_position][column_position]);
                if (i == col_qty - 1) {
                    row_qty--;
                    column_position--;
                } else {
                    row_position++;
                }
            }

            if (row_qty == 0 || col_qty == 0) {
                return ans;
            }

            for (int i = 0; i < row_qty; i++) {
                ans.add(matrix[row_position][column_position]);
                if (i == row_qty - 1) {
                    col_qty--;
                    row_position--;
                } else {
                    column_position--;
                }
            }

            if (row_qty == 0 || col_qty == 0) {
                return ans;
            }

            for (int i = 0; i < col_qty; i++) {
                ans.add(matrix[row_position][column_position]);
                if (i == col_qty - 1) {
                    row_qty--;
                    column_position++;
                } else {
                    row_position--;
                }
            }

            if (row_qty == 0 || col_qty == 0) {
                return ans;
            }

        }

    }

}

// hardware test engineer: electrical board testing
