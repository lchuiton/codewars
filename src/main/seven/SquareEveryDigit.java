package seven;

import java.math.BigInteger;

public class SquareEveryDigit {
  public int squareDigits(int n) {
    String[] numbers = (Integer.toString(n)).split("");
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < numbers.length; i++) {
      if (!"".equals(numbers[i])) {
        sb.append(new BigInteger(numbers[i]).pow(2).toString());
      }
    }
    return Integer.valueOf(sb.toString());
  }
}
