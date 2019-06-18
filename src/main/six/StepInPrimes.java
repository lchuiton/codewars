package six;

import static util.MathUtil.isPrimeNumber;

class StepInPrimes {

    private StepInPrimes() {

    }

    public static long[] step(int step, int startInterval, int endInterval) {

        int i = startInterval;

        while (i <= endInterval - step) {
            if (isPrimeNumber(i) && isPrimeNumber(i + step)) {
                return new long[]{i, i + step};
            }

            i++;
        }

        return new long[0];
    }
}
