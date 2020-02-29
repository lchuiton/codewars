package seven;

import java.math.BigInteger;

class SquareEveryDigit {

  public int squareDigits(int n) {
    String[] numbers = (Integer.toString(n)).split("");
    StringBuilder sb = new StringBuilder();
    for (String number : numbers) {
      if (!"".equals(number)) {
        sb.append(new BigInteger(number).pow(2).toString());
      }
    }
    return Integer.valueOf(sb.toString());
  }
}
