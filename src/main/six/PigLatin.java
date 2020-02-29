package six;

import java.util.Arrays;
import java.util.List;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static java.lang.Character.isLetter;

/**
 * Traduit le mot en PigLatin A FAIRE : Utiliser les Regex la prochaine fois ...
 *
 * @author lchuiton
 */
class PigLatin {

  private final List<String> voyelles = Arrays.asList("a", "e", "i", "o", "u");

  public String translate(String string) {
    String workString = string.toLowerCase();
    StringBuilder builder = new StringBuilder(workString);
    if (containNonAlphaChar(workString)) {
      return null;
    }
    if (containAVoyel(workString)) {
      if (startWithAVoyel(workString)) {
        return builder.append("way").toString();
      }
      workString = rotateString(workString);
      while (!startWithAVoyel(workString)) {
        workString = rotateString(workString);
      }
      builder = new StringBuilder(workString);
    }
    return builder.append("ay").toString();
  }

  private boolean containNonAlphaChar(String string) {
    char[] charArray = string.toCharArray();
    for (char aCharArray : charArray) {
      if (!isLetter(aCharArray)) {
        return TRUE;
      }
    }
    return FALSE;
  }

  private boolean containAVoyel(String s) {
    for (String voyelle : voyelles) {
      if (s.contains(voyelle)) {
        return TRUE;
      }
    }
    return FALSE;
  }

  private boolean startWithAVoyel(String s) {
    return voyelles.contains(String.valueOf(s.charAt(0)));
  }

  private String rotateString(String s) {
    char[] charArray = s.toCharArray();
    for (int j = 0; j < charArray.length - 1; j++) {
      char temp = charArray[j];
      charArray[j] = charArray[j + 1];
      charArray[j + 1] = temp;
    }
    return new String(charArray);
  }
}
