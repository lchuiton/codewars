package seven;

class WhoIsTheWinner {

  public static String declareWinner(Fighter fighterOne, Fighter fighterTwo, String firstAttacker) {

    String lastAttacker = firstAttacker;
    if (fighterOne.name.equals(firstAttacker)) {
      fighterTwo.health -= fighterOne.damagePerAttack;
    } else {
      fighterOne.health -= fighterTwo.damagePerAttack;
    }

    while (isAlive(fighterOne) && isAlive(fighterTwo)) {
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

  private static boolean isAlive(Fighter fighter) {
    return fighter.health > 0;
  }

  static class Fighter {

    final String name;
    final int damagePerAttack;
    int health;

    public Fighter(String name, int health, int damagePerAttack) {
      this.name = name;
      this.health = health;
      this.damagePerAttack = damagePerAttack;
    }
  }
}
