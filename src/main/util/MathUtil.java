package util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
 * Utilitaire de calcul utiliser dans les Katas
 * 
 * @author lchuiton
 * 
 */
public class MathUtil {
  protected static final BigInteger BigIntegerZERO = BigInteger.ZERO;

  protected static final BigInteger BigIntegerONE = BigInteger.ONE;

  protected static final BigInteger BigIntegerTWO = BigInteger.valueOf(2);

  protected static final BigInteger BigIntegerTHREE = BigInteger.valueOf(3);

  protected static final BigInteger FactorialBreakpoint = BigInteger.valueOf(96);

  protected static final BigDecimal BigDecimalZERO = BigDecimal.ZERO;

  protected static final BigDecimal BigDecimalONE = BigDecimal.ONE;

  protected static final BigDecimal BigDecimalTWO = new BigDecimal(2);

  protected static final BigDecimal BigDecimalFOUR = new BigDecimal(4);

  private MathUtil() {

  }

  /**
   * Calcul la factorielle de n
   * 
   * @param n
   * @return factorielle(n)
   */
  public static BigInteger factorial(BigInteger n) {
    BigInteger result = BigInteger.ONE;
    BigInteger bigInt = n;
    while (!bigInt.equals(BigInteger.ZERO)) {
      result = result.multiply(bigInt);
      bigInt = bigInt.subtract(BigInteger.ONE);
    }

    return result;
  }

  public static BigInteger factorial(int n) {
    return factorial(BigInteger.valueOf(n));
  }

  /**
   * Détermine si le nombre number est un nombre premier
   * 
   * @param number
   * @return BOOLEAN
   */
  public static boolean isPrimeNumber(int number) {
    return isPrimeNumber(Long.valueOf(number));
  }

  /**
   * Détermine si le nombre number est un nombre premier
   * 
   * @param number
   * @return BOOLEAN
   */
  public static boolean isPrimeNumber(Long number) {
    for (int i = 2; i <= number / 2; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static BigInteger sqrt(BigInteger number) {
    return sqrt(number, BigIntegerONE);
  }

  public static BigDecimal sqrt(BigDecimal number, RoundingMode rounding) {
    return sqrt(number, BigDecimalONE, rounding);
  }

  protected static BigInteger sqrt(BigInteger number, BigInteger guess) {
    BigInteger result = BigIntegerZERO;
    BigInteger flipA = result;
    BigInteger flipB = result;
    boolean first = true;
    while (result.compareTo(guess) != 0) {
      if (!first)
        guess = result;
      else
        first = false;

      result = number.divide(guess).add(guess).divide(BigIntegerTWO);
      if (result.equals(flipB))
        return flipA;

      flipB = flipA;
      flipA = result;
    }
    return result;

  }

  public static BigDecimal sqrt(BigDecimal number, BigDecimal guess, RoundingMode rounding) {
    BigDecimal result = BigDecimalZERO;
    BigDecimal flipA = result;
    BigDecimal flipB = result;
    boolean first = true;
    while (result.compareTo(guess) != 0) {
      if (!first)
        guess = result;
      else
        first = false;

      result = number.divide(guess, rounding).add(guess).divide(BigDecimalTWO, rounding);
      // handle flip flops
      if (result.equals(flipB))
        return flipA;

      flipB = flipA;
      flipA = result;
    }
    return result;
  }
}
