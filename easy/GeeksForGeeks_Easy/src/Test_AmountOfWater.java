import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Test_AmountOfWater {

    @Test
    public void testOne() {
        int[] arr = new int[] { 3, 0, 2, 0, 4 };
        int n = 5;

        int res = AmountOfWater.maxWater(arr, n);
        assertEquals(res, 7);

    }

    @Test
    public void testTwo() {
        int[] arr = new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        int n = 12;

        int res = AmountOfWater.maxWater(arr, n);
        assertEquals(res, 6);
    }

}
