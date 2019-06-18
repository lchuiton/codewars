package six;

import java.math.BigInteger;

class Persist {

    public static int persistence(long n) {
        int result = 0;
        String test = String.valueOf(n);
        while (test.length() > 1) {
            result++;
            test = calculateProductOfDigits(test);
        }
        return result;
    }

    private static String calculateProductOfDigits(String test) {
        char[] digits = test.toCharArray();
        BigInteger result = BigInteger.ONE;
        for (char digit : digits) {
            result = result.multiply(new BigInteger(String.valueOf(digit)));
        }
        return result.toString();
    }
}
