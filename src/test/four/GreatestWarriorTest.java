package four;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD development by writing your own tests

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
}