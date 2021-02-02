import org.junit.Test;

public class Test_FindElements {
    @Test
    public void passCase() {
        long[] arr = new long[] { 3, 4, 5, 6, 7 };
        long n = 5;
        long[] res = FindElements.findElements(arr, n);

        int index = 0;
        for (long value : res) {
            System.out.print(value);
        }

    }

}
