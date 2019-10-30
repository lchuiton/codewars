package seven;

class FindDivisor {

  public static long numberOfDivisors(int n) {
    long count = 0;
    for (int i = n; i > 0; i--) {
      count += n % i == 0 ? 1 : 0;
    }
    return count;
  }
}
