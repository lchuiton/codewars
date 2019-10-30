package seven;

import java.math.BigDecimal;
import java.math.RoundingMode;

class NthSeries {

  public static String seriesSum(int n) {
    double somme = 0.00;
    for (int i = 0; i < n; i++) {
      double resN = calcI(i);
      somme = somme + resN;
    }
    return BigDecimal.valueOf(somme).setScale(2, RoundingMode.HALF_UP).toString();
  }

  private static double calcI(double i) {
    return 1 / (3 * i + 1);
  }
}
