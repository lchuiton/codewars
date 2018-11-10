package six;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.ZERO;

import java.math.BigInteger;

class TriangleNumbers {

  private TriangleNumbers() {

  }

  public static Boolean isTriangleNumber(int number) {

    BigInteger num = BigInteger.valueOf(number);

    BigInteger step = ONE;
    while (num.divide(step).compareTo(ONE) > 0) {
      num = num.subtract(step);
      step = step.add(ONE);
    }

    return num.mod(step).equals(ZERO);
  }
}
