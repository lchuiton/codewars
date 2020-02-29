package four;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** From https://www.codewars.com/kata/the-greatest-warrior/train/java */
class GreatestWarrior {

  private int experience = 100;
  private List<String> achievements = new ArrayList<>();

  private final List<String> rankList =
      Arrays.asList(
          "Pushover",
          "Novice",
          "Fighter",
          "Warrior",
          "Veteran",
          "Sage",
          "Elite",
          "Conqueror",
          "Champion",
          "Master",
          "Greatest");

  int level() {
    return this.experience() / 100;
  }

  int experience() {
    return Math.min(this.experience, 10000);
  }

  String rank() {
    return rank(this.level());
  }

  private String rank(int level) {
    return rankList.get(level / 10);
  }

  List<String> achievements() {
    return this.achievements;
  }

  String training(String achievement, int experience, int minLevelRequirement) {

    if (minLevelRequirement > this.level()) {
      return "Not strong enough";
    }

    this.experience += experience;

    this.achievements.add(achievement);
    return achievement;
  }

  String battle(int enemyLevel) {
    int levelDifference = enemyLevel - this.level();

    String battleResult;
    if (enemyLevel < 1 || enemyLevel > 100) {
      return "Invalid level";
    }
    if (enemyLevel >= (this.level() + 5) && !rank(enemyLevel).equals(this.rank())) {
      return "You've been defeated";
    }

    if (levelDifference < -1) {
      battleResult = "Easy fight";
    } else if (levelDifference == -1) {
      experience += 5;
      battleResult = "A good fight";
    } else if (levelDifference == 0) {
      experience += 10;
      battleResult = "A good fight";
    } else {
      experience += (levelDifference * levelDifference * 20);
      battleResult = "An intense fight";
    }

    return battleResult;
  }
}
