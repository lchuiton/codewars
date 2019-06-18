package seven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticSequenceTest {

    @Test
    public void testArithmeticSequence_knownValues() {
        assertEquals(ArithmeticSequence.nthterm(0, 55, 1), 55, "Wrong answer for first = 0 n = 55 d = 1");
        assertEquals(ArithmeticSequence.nthterm(0, 100, 5), 500, "Wrong answer for first = 0 n = 100 d = 5");
        assertEquals(ArithmeticSequence.nthterm(14, 4, 7), 42, "Wrong answer for first = 14 n = 4 d = 7");
        assertEquals(ArithmeticSequence.nthterm(10000, 99, -50), 5050, "Wrong answer for first = 10000 n = 99 d = -50");
        assertEquals(ArithmeticSequence.nthterm(10000, 110, -50), 4500, "Wrong answer for first = 10000 n = 110 d = -50");
        assertEquals(ArithmeticSequence.nthterm(0, 99, 1), 99, "Wrong answer for first = 0 n = 99 d = 1");
    }
}
