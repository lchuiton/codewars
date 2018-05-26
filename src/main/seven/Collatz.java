package seven;

public class Collatz {
  public static long conjecture(long x) {
    long count = 1;
    long reste = x;
    while (reste > 1) {
      count++;
      reste = reste % 2 != 0 ? reste * 3 + 1 : reste / 2;
    }

    return count;
  }
}
