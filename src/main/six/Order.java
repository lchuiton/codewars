package six;

import java.util.Arrays;
import java.util.List;

class Order {

  public static String order(String words) {
    StringBuilder sb = new StringBuilder();

    if (!words.isEmpty()) {

      List<String> mots = Arrays.asList(words.split(" "));
      String[] phrase = new String[mots.size()];
      for (String string : mots) {
        int pos = Integer.parseInt(string.replaceAll("[a-zA-Z]", ""));
        phrase[pos - 1] = string;
      }

      for (int i = 0; i < phrase.length; i++) {
        if (i > 0) {
          sb.append(" ");
        }
        sb.append(phrase[i]);
      }
    }

    return sb.toString();
  }
}
