package util;

/**
 * Utiliser pour le Kata WhoIsTheWinner (7kyu)
 * 
 * @author lchuiton
 * 
 */
public class Fighter {
  public String name;

  public int health, damagePerAttack;

  public Fighter(String name, int health, int damagePerAttack) {
    this.name = name;
    this.health = health;
    this.damagePerAttack = damagePerAttack;
  }
}