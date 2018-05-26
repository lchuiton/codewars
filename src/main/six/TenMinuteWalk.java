package six;

public class TenMinuteWalk {

  public static boolean isValid(char[] walk) {
    int deplacementVertical = 0;
    int deplacementHorizontal = 0;
    if (walk.length == 10) {
      for (int i = 0; i < walk.length; i++) {
        if (walk[i] == 'n') {
          deplacementVertical++;
        } else if (walk[i] == 's') {
          deplacementVertical--;
        } else if (walk[i] == 'w') {
          deplacementHorizontal++;
        } else if (walk[i] == 'e') {
          deplacementHorizontal--;
        }
      }
      return deplacementVertical + deplacementHorizontal == 0;
    }
    return false;
  }
}
