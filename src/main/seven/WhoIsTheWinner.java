package seven;

import util.Fighter;

public class WhoIsTheWinner {

  public static String declareWinner(Fighter fighterOne, Fighter fighterTwo, String firstAttacker) {

    String lastAttacker = firstAttacker;
    if (fighterOne.name.equals(firstAttacker)) {
      fighterTwo.health -= fighterOne.damagePerAttack;
    } else {
      fighterOne.health -= fighterTwo.damagePerAttack;
    }

    while (!isDead(fighterOne) && !isDead(fighterTwo)) {
      if (fighterOne.name.equals(lastAttacker)) {
        fighterOne.health -= fighterTwo.damagePerAttack;
        lastAttacker = fighterTwo.name;
      } else {
        fighterTwo.health -= fighterOne.damagePerAttack;
        lastAttacker = fighterOne.name;

      }
    }
    return lastAttacker;
  }

  private static boolean isDead(Fighter fighter) {
    return fighter.health <= 0;
  }

}
