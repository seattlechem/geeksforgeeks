import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Test_FindTransitionPoint {
    @Test
    public void testOne() {
        int[] arr = new int[] {0,0,0,1,1};
        int n = 5;
        int res = FindTransitionPoint.transitionPoint(arr, n);
        assertEquals(res, 3);

    }

    @Test
    public void testStartEnd() {

    }
}
