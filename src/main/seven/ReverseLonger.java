package seven;

public class ReverseLonger {
  public static String shorterReverseLonger(String a, String b) {
    StringBuilder longer = new StringBuilder(a);
    StringBuilder shorter = new StringBuilder(b);
    if (a.length() < b.length()) {
      longer = new StringBuilder(b);
      shorter = new StringBuilder(a);
    }

    return new StringBuilder().append(shorter).append(longer.reverse()).append(shorter).toString();

  }

}
