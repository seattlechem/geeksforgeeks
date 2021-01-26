import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Test_ReplaceAllZeroWithFive {
    @Test
    public void TestZero() {
        int n = 3040;
        int res = ReplaceAllZeroWithFive.convertFive(n);
        assertEquals(res, 3545);
    }
}
