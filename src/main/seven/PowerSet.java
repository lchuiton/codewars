package seven;

import java.math.BigInteger;

public class PowerSet {

  public static BigInteger powers(int[] list) {
    return BigInteger.valueOf(2).pow(list.length);
  }
}
