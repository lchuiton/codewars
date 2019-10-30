package seven;

class CompleteThePattern {

  public static String pattern(int n) {
    StringBuilder sb = new StringBuilder();

    for (int i = 1; i <= n; i++) {
      if (i > 1) {
        sb.append("\n");
      }
      for (int j = n; j >= i; j--) {
        sb.append(String.valueOf(j));
      }
    }
    return sb.toString();
  }
}
