package seven;

import static java.lang.Math.abs;
import static java.lang.Math.floor;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

class Square {

  public static Boolean isSquare(int nombre) {
    double epsilon = 0.0000000001;
    return abs(pow(floor(sqrt(nombre)), 2) - nombre) < epsilon;
  }
}
