package eight;

import java.util.Arrays;

public class SmashWords {
  public static String smash(String... words) {
    return words == null ? null : Arrays.toString(words).replaceAll("\\[|,|\\]", "");
  }
}
