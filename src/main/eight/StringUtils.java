package eight;

class StringUtils {

  private StringUtils() {

  }

  public static String toAlternativeString(String string) {
    char[] charArray = string.toCharArray();

    StringBuilder stringBuilder = new StringBuilder();
    for (char c : charArray) {
      if (Character.isUpperCase(c)) {
        stringBuilder.append(Character.toLowerCase(c));
      } else {
        stringBuilder.append(Character.toUpperCase(c));
      }
    }

    return stringBuilder.toString();
  }
}
