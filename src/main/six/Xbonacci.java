package six;

class Xbonacci {

  public double[] tribonacci(double[] debutSuite, int nombreIteration) {
    double[] suite = new double[nombreIteration];

    if (nombreIteration != 0) {
      if (nombreIteration < debutSuite.length) {
        System.arraycopy(debutSuite, 0, suite, 0, nombreIteration);
      } else {
        System.arraycopy(debutSuite, 0, suite, 0, debutSuite.length);

        for (int i = debutSuite.length; i < nombreIteration; i++) {
          suite[i] = suite[i - 1] + suite[i - 2] + suite[i - 3];
        }
      }
    }

    return suite;
  }
}
