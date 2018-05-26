package six;

import java.util.HashMap;
import java.util.Map;

public class FindOdd {
  public static int findIt(int[] A) {
    int[] tabIt = A;

    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < tabIt.length; i++) {
      if (map.containsKey(tabIt[i])) {
        map.put(tabIt[i], map.get(tabIt[i]) + 1);
      } else {
        map.put(tabIt[i], 1);
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
