public class ReplaceAllZeroWithFive {
    public static int convertFive(int n) {
        n += replaceZeroWithFive(n);
        return n;
    }

    public static int replaceZeroWithFive(int number) {
        int decimal = 1;
        int answer = 0;

        if (number == 0) {
            return 5;
        }

        while (number > 0) {
            if (number % 10 == 0) {
                answer += decimal * (5);
            }
            decimal *= 10;
            number /= 10;
        }

        return answer;


    }

}
