package six;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ModSystemTest {

    @Test
    public void testOne() {
        int[] lst = new int[]{2, 3, 5};
        assertEquals("-1--2--1-", ModSystem.fromNb2Str(11, lst));
    }

    @Test
    public void testTwo() {
        int[] lst = new int[]{2, 3, 5};
        assertEquals("-1--2--3-", ModSystem.fromNb2Str(23, lst));
    }

    @Test
    public void testThree() {
        int[] lst = new int[]{8, 7, 5, 3};
        assertEquals("-3--5--2--1-", ModSystem.fromNb2Str(187, lst));
    }

    @Test
    public void testFour() {
        int[] lst = new int[]{8, 6, 5};
        assertEquals("Not applicable", ModSystem.fromNb2Str(15, lst));
    }

    @Test
    public void testNotApplicableOne() {
        int[] lst = new int[]{2, 3};
        assertEquals("Not applicable", ModSystem.fromNb2Str(7, lst));
    }

    @Test
    public void testNotApplicableTwo() {
        int[] lst = new int[]{2, 3, 4};
        assertEquals("Not applicable", ModSystem.fromNb2Str(6, lst));
    }

}