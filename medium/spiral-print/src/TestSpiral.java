import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;

import org.junit.Test;


public class TestSpiral {
    @Test
    public void testOne() {
        int[][] arr = new int[][] {
                { 1, 2, 3, 4 },
                { 12, 13, 14, 5 },
                { 11, 16, 15, 6 },
                {10, 9, 8, 7} };
        int r = 4;
        int c = 4;
        ArrayList<Integer> ans = Solution.spiral_print(arr, r, c);

        ArrayList<Integer> expected = new ArrayList<Integer>();
        for (int i = 1; i < 17; i++) {
            expected.add(i);
        }
        assertEquals(ans.toString(), expected.toString());

    }

}
