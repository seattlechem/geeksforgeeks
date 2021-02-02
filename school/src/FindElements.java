import java.util.ArrayList;

public class FindElements {
    static long[] findElements(long arr[], long n)
{
    int first = Integer.MIN_VALUE;
    int second = Integer.MAX_VALUE;

    for (int i = 0; i < n; i++)
    {
        // If current element is smaller
        // than first then update both
        // first and second
        if (arr[i] > first) {
            second = first;
            first = (int)arr[i];
        }

        /* If arr[i] is in between
        first and second
        then update second */
        else if (arr[i] > second)
            second = (int)arr[i];
    }

    ArrayList<Long> res = new ArrayList<Long>();

    for (int i = 0; i < n; i++)
        if (arr[i] < second) {
            res.add(arr[i]);
            // System.out.print(arr[i] + " ");
        }

    long[] names = new long[res.size()];
    int index = 0;
      for (final Long value : res) {
         names[index++] = value;
      }
    return names;
}

}
