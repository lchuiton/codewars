package six;

class TenMinuteWalk {

  public static boolean isValid(char[] walk) {
    int deplacementVertical = 0;
    int deplacementHorizontal = 0;
    if (walk.length == 10) {
      for (char aWalk : walk) {
        if (aWalk == 'n') {
          deplacementVertical++;
        } else if (aWalk == 's') {
          deplacementVertical--;
        } else if (aWalk == 'w') {
          deplacementHorizontal++;
        } else if (aWalk == 'e') {
          deplacementHorizontal--;
        }
      }
      return deplacementVertical + deplacementHorizontal == 0;
    }
    return false;
  }
}
