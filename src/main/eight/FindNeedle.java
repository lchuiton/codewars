package eight;

import java.util.Arrays;

/**
 * 
 * @author lchuiton
 * @category CodeWars 8 Kyu
 */
public class FindNeedle {
  private FindNeedle() {

  }

  /**
   * Recherche la chaine de caractère dans un tableau de chaine
   * 
   * @param haystack
   *          : Un tableau de String
   * @return La position du mot "needle"
   */
  public static String findNeedle(Object[] haystack) {
    return String.format("found the needle at position %d", Arrays.asList(haystack).indexOf("needle"));

  }
}
