package five;

import static java.math.BigInteger.ONE;
import static java.math.BigInteger.ZERO;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

class SumFct {

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
    List<BigInteger> listeFibonacci = new ArrayList<>();

    listeFibonacci.add(ONE);
    listeFibonacci.add(ONE);
    for (int i = 2; i < n.intValue(); i++) {
      listeFibonacci.add(listeFibonacci.get(i - 2).add(listeFibonacci.get(i - 1)));
    }

    return listeFibonacci;
  }
}
