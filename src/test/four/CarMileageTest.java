package four;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarMileageTest {

    @Test
    public void testTooSmall() {
        assertEquals(0, CarMileage.isInteresting(3, new int[]{1337, 256}));
    }

    @Test
    public void testAlmostAwesome() {
        assertEquals(1, CarMileage.isInteresting(1336, new int[]{1337, 256}));
    }

    @Test
    public void testAwesome() {
        assertEquals(2, CarMileage.isInteresting(1337, new int[]{1337, 256}));
    }

    @Test
    public void testFarNotInteresting() {
        assertEquals(0, CarMileage.isInteresting(11208, new int[]{1337, 256}));
    }

    @Test
    public void testAlmostInteresting() {
        assertEquals(1, CarMileage.isInteresting(11209, new int[]{1337, 256}));
    }

    @Test
    public void testInteresting() {
        assertEquals(2, CarMileage.isInteresting(11211, new int[]{1337, 256}));
    }

    @Test
    public void testZeros() {
        assertEquals(2, CarMileage.isInteresting(10000, new int[]{1337, 256}));
    }

    @Test
    public void testAllTheSame() {
        assertEquals(2, CarMileage.isInteresting(999, new int[]{1337, 256}));
    }

    @Test
    public void testAlmostZeros() {
        assertEquals(1, CarMileage.isInteresting(899, new int[]{1337, 256}));
    }

    @Test
    public void testSequentialIncr() {
        assertEquals(2, CarMileage.isInteresting(1234, new int[]{1337, 256}));
        assertEquals(2, CarMileage.isInteresting(7890, new int[]{1337, 256}));
    }

    @Test
    public void testSequentialDecr() {
        assertEquals(2, CarMileage.isInteresting(4321, new int[]{1337, 256}));
        assertEquals(2, CarMileage.isInteresting(43210, new int[]{1337, 256}));
    }

    @Test
    public void testPalindrome() {
        assertEquals(2, CarMileage.isInteresting(112211, new int[]{1337, 256}));
        assertEquals(1, CarMileage.isInteresting(112210, new int[]{1337, 256}));
    }

}