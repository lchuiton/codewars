package eight;

public class StringUtils {

  private StringUtils() {

  }

  public static String toAlternativeString(String string) {
    char[] charArray = string.toCharArray();

    StringBuilder stringBuilder = new StringBuilder();
    for (int i = 0; i < charArray.length; i++) {
      char c = charArray[i];
      if (Character.isUpperCase(c)) {
        stringBuilder.append(Character.toLowerCase(c));
      } else {
        stringBuilder.append(Character.toUpperCase(c));
      }
    }

    return stringBuilder.toString();
  }
}
