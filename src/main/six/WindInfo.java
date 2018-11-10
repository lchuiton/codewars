package six;

import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.toRadians;
import static java.math.BigInteger.ZERO;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

class WindInfo {

  private WindInfo() {

  }

  public static String message(String rwy, int windDirection, int windSpeed) {
    Double directionAngleInDegree = Double.valueOf(rwy.substring(0, 2)) * 10;
    Double windAngleInDegree = (double) windDirection;
    Double relativeWindAngleInDegree = windAngleInDegree - directionAngleInDegree;

    BigInteger headWind = calculateHeadWindSpeed(relativeWindAngleInDegree, (double) windSpeed);
    String direction = "Headwind ";
    if (headWind.compareTo(ZERO) < 0) {
      direction = "Tailwind ";
    }

    BigInteger crossWind = calculateCrossWindSpeed(relativeWindAngleInDegree, (double) windSpeed);
    String windSide = "right.";
    if (crossWind.compareTo(ZERO) < 0) {
      windSide = "left.";
    }

    String headWindString = headWind.abs().toString();
    String crossWindString = crossWind.abs().toString();

    return direction + headWindString + " knots. Crosswind " + crossWindString + " knots from your " + windSide;
  }

  private static BigInteger calculateCrossWindSpeed(Double degreeAngle, Double speed) {
    BigDecimal windSpeed = BigDecimal.valueOf(sin(toRadians(degreeAngle)) * speed);
    return new BigInteger(windSpeed.setScale(0, RoundingMode.HALF_UP).toString());
  }

  private static BigInteger calculateHeadWindSpeed(Double degreeAngle, Double speed) {
    BigDecimal windSpeed = BigDecimal.valueOf(cos(toRadians(degreeAngle)) * speed);
    return new BigInteger(windSpeed.setScale(0, RoundingMode.HALF_UP).toString());
  }
}
