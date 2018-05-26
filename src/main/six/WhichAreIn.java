package six;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class WhichAreIn {

  private WhichAreIn() {

  }

  public static String[] inArray(String[] array1, String[] array2) {

    List<String> listeA = Arrays.asList(array1);

    List<String> result = new ArrayList<>();
    for (String string : listeA) {
      for (int i = 0; i < array2.length; i++) {
        if (array2[i].matches(".*" + string + ".*")) {
          result = ajoutSansDoublon(result, string);
        }
      }
    }

    Collections.sort(result);

    return result.toArray(new String[result.size()]);
  }

  private static List<String> ajoutSansDoublon(List<String> result, String string) {
    if (result.indexOf(string) == -1) {
      result.add(string);
    }
    return result;
  }
}
