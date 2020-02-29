package six;

class Pentanacci {

  public static long countOddPentaFib(long l) {
    long nbOdd = 0;
    int[] s = calculDeLaSuite();

    for (int i = 0; i < s.length - 1; i++) {

      if (s[i] % 2 != 0 && s[i] != s[i + 1]) {
        nbOdd++;
      }
    }
    if (s[s.length - 1] % 2 != 0) {
      nbOdd++;
    }
    int[] cinqDernierResultat = {s[5], s[6], s[7], s[8], s[9]};
    for (int i = 10; i <= l; i++) {
      int nextNumber = 2;
      if (isNextNumberOdd(cinqDernierResultat)) {
        nbOdd++;
        nextNumber = 1;
      }
      cinqDernierResultat =
          new int[] {
            cinqDernierResultat[1],
            cinqDernierResultat[2],
            cinqDernierResultat[3],
            cinqDernierResultat[4],
            nextNumber
          };
    }

    return nbOdd;
  }

  private static boolean isNextNumberOdd(int[] sPenta) {
    int somme = sPenta[0] + sPenta[1] + sPenta[2] + sPenta[3] + sPenta[4];
    return somme % 2 != 0;
  }

  private static int[] calculDeLaSuite() {
    int[] debutSuite = {0, 1, 1, 2, 4};

    int[] suite = new int[10];

    System.arraycopy(debutSuite, 0, suite, 0, debutSuite.length);

    for (int i = debutSuite.length; i < 10; i++) {
      suite[i] = suite[i - 1] + suite[i - 2] + suite[i - 3] + suite[i - 4] + suite[i - 5];
    }
    return suite;
  }
}
