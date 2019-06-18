package seven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollatzTest {

    @Test
    public void test0() {
        assertEquals(8, Collatz.conjecture(20));
    }
}
