package seven;

import static java.lang.Math.*;

public class Square {
  public static Boolean isSquare(int nombre) {
    double epsilon = 0.0000000001;
    return abs(pow(floor(sqrt(nombre)), 2) - nombre) < epsilon;
  }
}
