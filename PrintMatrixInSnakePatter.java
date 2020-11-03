import java.util.ArrayList;

public class PrintMatrixInSnakePattern {
    static ArrayList<Integer> snakePattern(int matrix[][])
    {
        int n = matrix.length;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < n; i++ ) {
            for (int j = 0; j < n; j++) {
                // if i is even
                if (i % 2 == 0) {
                    ans.add(matrix[i][j]);
                } else {
                    ans.add(matrix[i][n - j - 1]);
                }
            }
        }
        return ans;
    }
}
