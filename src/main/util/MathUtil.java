package util;

import java.math.BigInteger;

/**
 * Utilitaire de calcul utiliser dans les Katas
 *
 * @author lchuiton
 */
public class MathUtil {

    private MathUtil() {

    }

    public static BigInteger factorial(BigInteger n) {
        BigInteger result = BigInteger.ONE;
        BigInteger bigInt = n;
        while (!bigInt.equals(BigInteger.ZERO)) {
            result = result.multiply(bigInt);
            bigInt = bigInt.subtract(BigInteger.ONE);
        }

        return result;
    }

    public static boolean isPrimeNumber(int number) {
        return isPrimeNumber(Long.valueOf(number));
    }

    public static boolean isPrimeNumber(Long number) {
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


}
