package eight;

import java.util.Arrays;

class SmashWords {

  private static final String REGEX = "[\\[,\\]]";
  private static final String EMPTY_STRING = "";

  public static String smash(String... words) {
    return words == null ? null : Arrays.toString(words).replaceAll(REGEX, EMPTY_STRING);
  }
}
