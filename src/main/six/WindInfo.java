package six;

import java.math.BigDecimal;
import java.math.BigInteger;

import static java.lang.Math.*;
import static java.math.BigDecimal.ROUND_HALF_UP;
import static java.math.BigInteger.ZERO;

public class WindInfo {
  private WindInfo() {

  }

  public static String message(String rwy, int windDirection, int windSpeed) {
    Double directionAngleInDegree = new Double(rwy.substring(0, 2)) * 10;
    Double windAngleInDegree = new Double(windDirection);
    Double relativeWindAngleInDegree = windAngleInDegree - directionAngleInDegree;

    BigInteger headWind = calculateHeadWindSpeed(relativeWindAngleInDegree, Double.valueOf(windSpeed));
    String direction = "Headwind ";
    if (headWind.compareTo(ZERO) < 0) {
      direction = "Tailwind ";
    }

    BigInteger crossWind = calculateCrossWindSpeed(relativeWindAngleInDegree, Double.valueOf(windSpeed));
    String windSide = "right.";
    if (crossWind.compareTo(ZERO) < 0) {
      windSide = "left.";
    }

    String headWindString = headWind.abs().toString();
    String crossWindString = crossWind.abs().toString();

    StringBuilder message = new StringBuilder();
    message.append(direction + headWindString + " knots. Crosswind " + crossWindString + " knots from your " + windSide);

    return message.toString();
  }

  private static BigInteger calculateCrossWindSpeed(Double degreeAngle, Double speed) {
    BigDecimal windSpeed = BigDecimal.valueOf(sin(toRadians(degreeAngle)) * speed);
    return new BigInteger(windSpeed.setScale(0, ROUND_HALF_UP).toString());
  }

  private static BigInteger calculateHeadWindSpeed(Double degreeAngle, Double speed) {
    BigDecimal windSpeed = BigDecimal.valueOf(cos(toRadians(degreeAngle)) * speed);
    return new BigInteger(windSpeed.setScale(0, ROUND_HALF_UP).toString());
  }
}
