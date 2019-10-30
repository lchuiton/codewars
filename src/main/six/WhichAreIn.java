package six;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class WhichAreIn {

  private WhichAreIn() {}

  public static String[] inArray(String[] array1, String[] array2) {

    List<String> result = new ArrayList<>();
    for (String string : array1) {
      for (String anArray2 : array2) {
        if (anArray2.matches(".*" + string + ".*")) {
          ajoutSansDoublon(result, string);
        }
      }
    }

    Collections.sort(result);

    return result.toArray(new String[0]);
  }

  private static void ajoutSansDoublon(List<String> result, String string) {
    if (result.indexOf(string) == -1) {
      result.add(string);
    }
  }
}
