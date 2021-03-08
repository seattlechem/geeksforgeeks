import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Test_FindMedian {
    @Test
    public void passCase() {
        int[] v = new int[] { 1, 3, 7 };
        int answer = FindMedian.find_median(v);
        assertEquals(3, answer);
    }

}
