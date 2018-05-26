package seven;

import java.util.ArrayList;
import java.util.List;

public class UniqueArray {
  public static int[] unique(int[] integers) {
    List<Integer> listUnique = new ArrayList<>();

    for (int i = 0; i < integers.length; i++) {
      if (!listUnique.contains(integers[i])) {
        listUnique.add(integers[i]);
      }
    }

    int[] result = new int[listUnique.size()];

    for (int i = 0; i < result.length; i++) {
      result[i] = listUnique.get(i);
    }
    return result;

  }
}
