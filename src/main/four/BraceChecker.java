package four;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BraceChecker {

  private Map<String, String> mapOfBraces;

  public boolean isValid(String braces) {
    mapOfBraces = initializeBracesMap();
    List<String> openBraces = new ArrayList<>();

    for (int i = 0; i < braces.length(); i++) {
      String currentBrace = String.valueOf(braces.charAt(i));
      if (isOpenBrace(currentBrace)) {
        openBraces.add(String.valueOf(braces.charAt(i)));
      } else if (!openBraces.isEmpty() && currentBrace.equals(mapOfBraces.get(openBraces.get(openBraces.size() - 1)))) {
        openBraces.remove(openBraces.size() - 1);
      } else {
        return false;
      }
    }
    return openBraces.isEmpty();
  }

  private Map<String, String> initializeBracesMap() {
    Map<String, String> map = new HashMap<>();
    map.put("(", ")");
    map.put("{", "}");
    map.put("[", "]");

    return map;
  }

  private boolean isOpenBrace(String currentBrace) {
    return mapOfBraces.containsKey(currentBrace);
  }
}
