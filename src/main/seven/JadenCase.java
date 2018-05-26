package seven;

public class JadenCase {

  public String toJadenCase(String phrase) {
    StringBuilder sb = new StringBuilder();
    if (phrase != null && !phrase.isEmpty()) {

      String[] mots = phrase.split(" ");
      for (int i = 0; i < mots.length; i++) {
        if (i > 0) {
          sb.append(" ");
        }
        sb.append(mots[i].substring(0, 1).toUpperCase());
        sb.append(mots[i].substring(1));
      }
      return sb.toString();
    }
    return null;
  }
}
