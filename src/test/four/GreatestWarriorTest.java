package four;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class GreatestWarriorTest {

  @Test
  public void sampleTest1() {
    GreatestWarrior tom = new GreatestWarrior();
    assertEquals(1, tom.level());
    assertEquals(100, tom.experience());
    assertEquals("Pushover", tom.rank());
  }

  @Test
  public void sampleTest2() {
    GreatestWarrior bruce_lee = new GreatestWarrior();

    assertEquals(1, bruce_lee.level());
    assertEquals(100, bruce_lee.experience());
    assertEquals("Pushover", bruce_lee.rank());
    assertEquals(new ArrayList<String>(), bruce_lee.achievements());
    assertEquals("Defeated Chuck Norris", bruce_lee.training("Defeated Chuck Norris", 9000, 1));
    assertEquals(9100, bruce_lee.experience());
    assertEquals(91, bruce_lee.level());
    assertEquals("Master", bruce_lee.rank());
    assertEquals("A good fight", bruce_lee.battle(90));
    assertEquals(9105, bruce_lee.experience());
    assertEquals(Arrays.asList("Defeated Chuck Norris"), bruce_lee.achievements());
  }

  @Test
  public void sampleTest3() {
    GreatestWarrior warrior = new GreatestWarrior();

    assertEquals(1, warrior.level());
    assertEquals(100, warrior.experience());
    assertEquals("Pushover", warrior.rank());
    assertEquals(new ArrayList<String>(), warrior.achievements());

    assertEquals("An intense fight", warrior.battle(6));
    assertEquals(600, warrior.experience());
  }

  @Test
  public void sampleTest4() {
    GreatestWarrior warrior = new GreatestWarrior();

    assertEquals(1, warrior.level());
    assertEquals(100, warrior.experience());
    assertEquals("Pushover", warrior.rank());
    assertEquals(new ArrayList<String>(), warrior.achievements());

    assertEquals("An intense fight", warrior.battle(4));
    assertEquals(280, warrior.experience());
  }

  @Test
  public void training_NotStrongEnough() {
    GreatestWarrior warrior = new GreatestWarrior();

    assertEquals(1, warrior.level());
    assertEquals(100, warrior.experience());
    assertEquals("Pushover", warrior.rank());
    assertEquals(new ArrayList<String>(), warrior.achievements());

    assertEquals("Not strong enough", warrior.training("An unachievable achievement", 100, 4));
    assertEquals(100, warrior.experience());
  }
}
