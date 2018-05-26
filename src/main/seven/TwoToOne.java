package seven;

import java.util.Arrays;

public class TwoToOne {
  private TwoToOne() {

  }

  public static String longest(String s1, String s2) {
    StringBuilder stringBuilder = new StringBuilder(s1).append(s2);
    char[] charArray = stringBuilder.toString().toCharArray();
    Arrays.sort(charArray);
    stringBuilder = new StringBuilder();
    for (int i = 0; i < charArray.length; i++) {
      if (stringBuilder.indexOf(String.valueOf(charArray[i])) == -1) {
        stringBuilder.append(charArray[i]);
      }
    }

    return stringBuilder.toString();
  }
}
