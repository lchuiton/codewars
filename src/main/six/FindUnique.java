package six;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class FindUnique {

  private FindUnique() {
  }

  public static double findUniq(double[] arr) {

    Map<Double, Integer> numberOfOccurrences = new HashMap<>();
    for (double d : arr) {
      numberOfOccurrences.merge(d, 1, Integer::sum);
    }

    List<Double> valuesWithOneOccurrence = numberOfOccurrences.entrySet().stream().filter(a -> a.getValue() == 1).map(Entry::getKey)
        .collect(Collectors.toList());

    return valuesWithOneOccurrence.get(0);
  }
}
