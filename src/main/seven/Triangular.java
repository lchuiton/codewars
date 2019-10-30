package seven;

class Triangular {

  public static int triangular(int n) {
    int result = 0;
    for (int i = n; i > 0; i--) {
      result += i;
    }
    return result;
  }
}
