package five;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxSequenceTest {

    @Test
    public void testEmptyArray() {
        assertEquals(0, MaxSequence.sequence(new int[]{}), "Empty arrays should have a max of 0");
    }

    @Test
    public void testExampleArray() {
        assertEquals(6, MaxSequence.sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}), "Example array should have a max of 6");
    }

    @Test
    public void testRandom1() {
        assertEquals(

                99,
                MaxSequence.sequence(new int[]{-22, 14, -26, -15, -18, -27, -5, 25, 8, 13, -29, -23, 8, 2, -1, 11, -18, -1, -18, 9, 0, -3, -11, 16, -20, 8, 12, 19,
                        -1, 27, 14, 1, 19, -9, -28, -29, -20, 4, -14, 9, -4, 21, 7, 8, -13, 26, 8, 2, 0, -6, -5, -11, 18, 8, 1}), "Random1 shoud have a max of 99");
    }

    @Test
    public void testRandom2() {
        assertEquals(

                237,
                MaxSequence.sequence(new int[]{18, 3, 22, -3, -16, 9, 29, -11, -22, -18, 25, -6, 0, -3, 15, -6, 25, -13, 9, -11, -16, -20, 9, 18, -15, 11, 9, -4,
                        -20, 6, -29, -15, -24, -16, 4, 23, 23, -19, 3, -8, 11, -8, 26, -10, 29, 5, -4, 13, 18, 25, -8, 14, 25, -2, 21, 17, 29, 10}), "Random1 shoud have a max of 237");
    }

}