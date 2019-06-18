package seven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenOrOddTest {

    @Test
    public void testEvenOrOdd() {
        EvenOrOdd evenOrOdd = new EvenOrOdd();
        assertEquals(evenOrOdd.evenOrOdd(6), "Even");
        assertEquals(evenOrOdd.evenOrOdd(7), "Odd");
    }
}