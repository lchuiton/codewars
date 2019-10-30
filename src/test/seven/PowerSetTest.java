package seven;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class PowerSetTest {

    @Test
    public void testPactical() {
        assertEquals("An empty array should return 1!", PowerSet.powers(new int[]{}), BigInteger.valueOf(1));
        assertEquals(PowerSet.powers(new int[]{1}), BigInteger.valueOf(2));
        assertEquals(PowerSet.powers(new int[]{1, 2, 3, 4, 5}), BigInteger.valueOf(32));
    }

}