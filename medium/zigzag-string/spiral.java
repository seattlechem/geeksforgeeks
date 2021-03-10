import java.util.ArrayList;

class Solution {
    public void spiral_print(int[][] matrix, int r, int c) {
        ArrayList<Integer> ans = new ArrayList<Integer>();

        int row_start = 0;
        int col_start = 0;

        for (int i = 0; i < c; i++) {
            ans.add(matrix[row_start][i]);
        }
    }
}
