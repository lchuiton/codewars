package three;

import java.math.BigInteger;

class FibonacciMillionth {

  private static final BigInteger ZERO = new BigInteger("0");

  private static final BigInteger UN = new BigInteger("1");

  private static final BigInteger MOINS_UN = new BigInteger("-1");

  private static final BigInteger DEUX = new BigInteger("2");

  private FibonacciMillionth() {}

  public static BigInteger fib(BigInteger n) {
    if (n.compareTo(ZERO) < 0) {
      if (n.mod(DEUX).equals(ZERO)) {
        return fibIter(n.negate()).negate();
      }
      return fibIter(n.negate());
    }
    return fibIter(n);
  }

  private static BigInteger fibIter(BigInteger n) {
    BigInteger factor = UN;
    if (!n.mod(DEUX).equals(ZERO)) {
      factor = MOINS_UN;
    }
    if (n.equals(ZERO)) {
      return ZERO;
    } else if (n.equals(DEUX) || n.equals(UN) || n.equals(MOINS_UN)) {
      return UN;
    }
    return fibIter(n.divide(DEUX).add(UN))
        .pow(2)
        .subtract(factor.multiply(fibIter((n.subtract(UN)).divide(DEUX)).pow(2)));
  }
}
