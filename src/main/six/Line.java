package six;

import java.util.HashMap;
import java.util.Map;

public class Line {

  public static String sellTickets(int[] peopleInLine) {
    String result = "YES";
    Map<Integer, Integer> caisseVasya = new HashMap<>();
    caisseVasya.put(25, 0);
    caisseVasya.put(50, 0);
    caisseVasya.put(100, 0);

    for (int i = 0; i < peopleInLine.length; i++) {
      if (peopleInLine[i] == 25) {
        caisseVasya.put(25, caisseVasya.get(25) + 1);
      } else if (peopleInLine[i] == 50) {
        if (caisseVasya.get(25) == 0) {
          return "NO";
        } else {
          caisseVasya.put(25, caisseVasya.get(25) - 1);
          caisseVasya.put(50, caisseVasya.get(50) + 1);
        }
      } else {
        if (caisseVasya.get(25) == 0) {
          return "NO";
        } else if (caisseVasya.get(50) == 0) {
          if (caisseVasya.get(25) < 3) {
            return "NO";
          } else {
            caisseVasya.put(25, caisseVasya.get(25) - 3);
            caisseVasya.put(100, caisseVasya.get(100) + 1);
          }
        } else {
          caisseVasya.put(25, caisseVasya.get(25) - 1);
          caisseVasya.put(50, caisseVasya.get(50) - 1);
          caisseVasya.put(100, caisseVasya.get(100) + 1);
        }

      }

    }
    return result;
  }
}
