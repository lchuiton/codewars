package seven;

class AreaOfACircle {

  public static double area(double radius) {
    if (radius <= 0) {
      throw new IllegalArgumentException();
    }
    return Math.PI * Math.pow(radius, 2.0);
  }
}
