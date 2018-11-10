package seven;

import java.util.ArrayList;
import java.util.List;

class UniqueArray {

  public static int[] unique(int[] integers) {
    List<Integer> listUnique = new ArrayList<>();

    for (int integer : integers) {
      if (!listUnique.contains(integer)) {
        listUnique.add(integer);
      }
    }

    int[] result = new int[listUnique.size()];

    for (int i = 0; i < result.length; i++) {
      result[i] = listUnique.get(i);
    }
    return result;

  }
}
