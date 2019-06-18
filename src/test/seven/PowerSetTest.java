package seven;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerSetTest {

    @Test
    public void testPactical() {
        assertEquals(PowerSet.powers(new int[]{}), BigInteger.valueOf(1), "An empty array should return 1!");
        assertEquals(PowerSet.powers(new int[]{1}), BigInteger.valueOf(2));
        assertEquals(PowerSet.powers(new int[]{1, 2, 3, 4, 5}), BigInteger.valueOf(32));
    }

}