package six;

import java.util.HashMap;
import java.util.Map;

class FindOdd {

  public static int findIt(int[] tabIt) {

    Map<Integer, Integer> map = new HashMap<>();
    for (int aTabIt : tabIt) {
      if (map.containsKey(aTabIt)) {
        map.put(aTabIt, map.get(aTabIt) + 1);
      } else {
        map.put(aTabIt, 1);
      }
    }

    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() % 2 != 0) {
        return entry.getKey();
      }
    }

    return 0;
  }
}
