package eight;

class NumberToReverseArray {

  public static int[] digitize(long n) {
    char[] nToCharArray = String.valueOf(n).toCharArray();
    int[] nReversed = new int[nToCharArray.length];

    for (int i = 0; i < nReversed.length; i++) {
      nReversed[i] = Character.getNumericValue(nToCharArray[nReversed.length - (i + 1)]);
    }
    return nReversed;
  }
}
