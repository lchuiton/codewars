package four;

import java.util.List;

/**
 * From https://www.codewars.com/kata/the-greatest-warrior/train/java
 */

class GreatestWarrior {

    private int level;
    private int experience;
    private String rank;
    private List<String> achievements;

    public GreatestWarrior() {

        this.level = 1;
        this.experience = 100;
        this.rank = "Pushover";
    }

    int level() {
        return this.level;
    }

    int experience() {
        return this.experience;
    }

    String rank() {
        return this.rank;
    }

    List<String> achievements() {
        return this.achievements;
    }

    String training(String achievement, int experience, int minLevelRequirement) {
        this.achievements.add(achievement);
        this.experience += experience;

        return achievement;
    }

    String battle(int enemyLevel) {
        return "";

    }
}
