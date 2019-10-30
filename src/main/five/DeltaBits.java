package five;

class DeltaBits {

  private static final int NB_BITS_MAX = 32;

  private DeltaBits() {}

  public static int convertBits(int a, int b) {
    int numberOfBitsToChange = 0;
    int tailleDuTableauDeBits = Math.max(nbDeBits(a), nbDeBits(b));
    byte[] aBit = intToBytes(a, tailleDuTableauDeBits);
    byte[] bBit = intToBytes(b, tailleDuTableauDeBits);
    for (int i = 0; i < aBit.length; i++) {
      if (aBit[i] != bBit[i]) {
        numberOfBitsToChange++;
      }
    }

    return numberOfBitsToChange;
  }

  private static byte[] intToBytes(int intToConvert, int tailleDuTableauDeBits) {
    int integer = intToConvert;
    byte[] bytes = new byte[tailleDuTableauDeBits];
    for (int i = 0; i < tailleDuTableauDeBits; i++) {
      bytes[i] = (byte) (integer % 2);
      integer = integer >> 1;
    }
    return bytes;
  }

  private static int nbDeBits(int integer) {
    for (int i = 0; i < NB_BITS_MAX; i++) {
      if (integer <= Math.pow(i, 2)) {
        return i;
      }
    }
    return NB_BITS_MAX;
  }
}
