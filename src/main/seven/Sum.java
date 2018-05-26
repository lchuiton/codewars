package seven;

public class Sum {
  public int getSum(int a, int b) {
    int begin = Math.min(a, b);
    int end = Math.max(a, b);

    int sum = 0;

    for (int i = begin; i <= end; i++) {
      sum += i;
    }

    return sum;
  }
}
