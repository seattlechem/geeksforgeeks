class AmountOfWater {
    static int maxWater(int[] arr, int n) {
        int[] maxArr = new int[n];

        int maxVal = arr[0];
        for (int i = 0; i < n; i++) {
            if (maxVal < arr[i]) {
                maxVal = arr[i];
            }
            maxArr[i] = maxVal;
        }

        maxVal = arr[n - 1];
        for (int i = n - 1; i > -1; i--) {
            if (maxVal < arr[i]) {
                maxVal = arr[i];
            }
            if (maxVal < maxArr[i]) {
                maxArr[i] = maxVal;
            }
        }

        int res = 0;
        for (int i = 0; i < n; i++) {
            res += maxArr[i] - arr[i];
        }

        return res;

    }

}
