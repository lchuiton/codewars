package five;

import java.util.ArrayList;
import java.util.List;

class JosephusSurvivor {

  public static int josephusSurvivor(int n, int k) {

    List<Integer> survivors = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      survivors.add(i + 1);
    }

    int positionToRemove = 0;
    while (survivors.size() > 1) {
      positionToRemove = (positionToRemove + k - 1) % survivors.size();
      survivors.remove(positionToRemove);
    }

    return survivors.get(0);
  }
}
