package seven;

public class SmallestValueInArray {

  public static int findSmallest(final int[] numbers, final String toReturn) {

    int smallestNumber = Integer.MAX_VALUE;
    int smallestIndex = 0;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] < smallestNumber) {
        smallestNumber = numbers[i];
        smallestIndex = i;
      }
    }

    if ("index".equals(toReturn)) {
      return smallestIndex;
    }

    return smallestNumber;
  }
}
