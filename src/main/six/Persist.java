package six;

import java.math.BigInteger;

public class Persist {
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
    for (int i = 0; i < digits.length; i++) {
      result = result.multiply(new BigInteger(String.valueOf(digits[i])));
    }
    return result.toString();
  }
}
