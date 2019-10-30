package six;

class ASum {

  public static long findNb(long m) {
    long n = 0;
    long pyramide = 0;
    while (pyramide < m) {
      n++;
      pyramide = pyramide + n * n * n;
    }
    if (pyramide == m) {
      return n;
    }
    return -1;
  }
}
