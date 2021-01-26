import java.util.Arrays;

public class FindMedian {
    public static int find_median(int[] v) {
        int n = v.length;
        Arrays.sort(v);

        int mid = 0;
        int answer = 0;

        mid = n / 2;
        if (n % 2 == 0) {
            answer = (v[mid - 1] + v[mid]) / 2;
        }
        else {
            answer = v[mid];
        }
        return answer;
    }

}
