package seven;

public class SequenceSum {
  public static int[] sumOfN(int n) {
    int[] tab = new int[Math.abs(n) + 1];
    tab[0] = 0;
    for (int i = 1; i < tab.length; i++) {
      int toAdd = n > 0 ? i : -i;
      tab[i] = tab[i - 1] + toAdd;
    }
    return tab;
  }
}
