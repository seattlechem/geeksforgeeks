public class FindTransitionPoint {
    static int transitionPoint(int[] arr, int n) {
        int start = 0;
        int end = n - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == 1) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return (arr[start] == 1 ? start : -1);

    }
}
