package six;

public class Xbonacci {

  public double[] tribonacci(double[] debutSuite, int nombreIteration) {
    double[] suite = new double[nombreIteration];

    if (nombreIteration != 0) {
      if (nombreIteration < debutSuite.length) {
        for (int i = 0; i < nombreIteration; i++) {
          suite[i] = debutSuite[i];
        }
      } else {
        for (int i = 0; i < debutSuite.length; i++) {
          suite[i] = debutSuite[i];
        }

        for (int i = debutSuite.length; i < nombreIteration; i++) {
          suite[i] = suite[i - 1] + suite[i - 2] + suite[i - 3];
        }
      }
    }

    return suite;
  }
}