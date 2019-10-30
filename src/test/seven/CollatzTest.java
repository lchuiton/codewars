package seven;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CollatzTest {

    @Test
    public void test0() {
        assertEquals(8, Collatz.conjecture(20));
    }
}
