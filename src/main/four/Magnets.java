package four;


public class Magnets {

  public static double doubles(int k, int n) {

    Double somme = 0.0;
    for (int i = 1; i <= k; i++) {
      somme += u(i, n);
    }

    return somme;

  }

  /**
   * Somme des v
   * 
   * @param k
   * @param n
   * @return u
   */
  private static Double u(int k, int n) {

    Double somme = 0.0;
    for (int j = 1; j <= n; j++) {
      somme += v(k, j);
    }
    return somme;

  }

  /**
   * Calcul de la force d'une boite
   * 
   * @param k
   * @param n
   * @return v
   */
  private static Double v(int k, int n) {
    return 1 / (k * Math.pow(n + 1, 2 * k));

  }
  /**
   * SIGMA (n*(n+1))/2
   */
}
