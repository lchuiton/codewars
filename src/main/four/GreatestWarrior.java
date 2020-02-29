package four;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** From https://www.codewars.com/kata/the-greatest-warrior/train/java */
class GreatestWarrior {

  private int level = 1;
  private int experience = 100;
  private List<String> achievements = new ArrayList<>();

  private List<String> rankList =
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
    return this.level;
  }

  int experience() {
    return this.experience;
  }

  String rank() {
    return rankList.get(level / 10);
  }

  List<String> achievements() {
    return this.achievements;
  }

  String training(String achievement, int experience, int minLevelRequirement) {
    this.achievements.add(achievement);
    this.experience += experience;
    this.level = experience / 100 + 1;

    return achievement;
  }

  String battle(int enemyLevel) {

    experience += 5;

    return enemyLevel < 1 || enemyLevel > 100 ? "Invalid level" : "A good fight";
  }
}
