package six;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class CountingDuplicates {

  public static int duplicateCount(String text) {

    String[] string = text.toLowerCase().split("");
    Map<String, Integer> map = new HashMap<>();

    Arrays.stream(string).forEach(a -> map.merge(a, 1, Integer::sum));
    return map.entrySet().stream().filter(v -> v.getValue() > 1).map(Entry::getKey).collect(Collectors.toCollection(HashSet::new)).size();
  }
}