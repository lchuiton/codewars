package five;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.ZERO;

public class SumFct {
  public static BigInteger perimeter(BigInteger n) {

    List<BigInteger> liste = calculSuiteFibonacci(n.add(ONE));
    return calculSommeFibonacci(liste).multiply(BigInteger.valueOf(4));

  }

  private static BigInteger calculSommeFibonacci(List<BigInteger> liste) {
    BigInteger somme = ZERO;
    for (BigInteger bigInteger : liste) {
      somme = somme.add(bigInteger);

    }
    return somme;
  }

  private static List<BigInteger> calculSuiteFibonacci(BigInteger n) {
    BigInteger fib0 = ONE;
    BigInteger fib1 = ONE;

    List<BigInteger> listeFibonacci = new ArrayList<>();

    listeFibonacci.add(fib0);
    listeFibonacci.add(fib1);
    for (int i = 2; i < n.intValue(); i++) {
      listeFibonacci.add(listeFibonacci.get(i - 2).add(listeFibonacci.get(i - 1)));
    }

    return listeFibonacci;
  }
}
