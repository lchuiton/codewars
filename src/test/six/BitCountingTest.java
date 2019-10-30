package six;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BitCountingTest {

    @Test
    public void test1() {
        assertEquals(1, BitCounting.countBits(4));
    }

    @Test
    public void test2() {
        assertEquals(5, BitCounting.countBits(1234));
    }

    @Test
    public void test3() {
        assertEquals(3, BitCounting.countBits(7));
    }

    @Test
    public void test4() {
        assertEquals(2, BitCounting.countBits(9));
    }

    @Test
    public void test5() {
        assertEquals(2, BitCounting.countBits(10));
    }

    @Test
    public void test21() {
        assertEquals(1, BitCounting.countBits2(4));
    }

    @Test
    public void test22() {
        assertEquals(5, BitCounting.countBits2(1234));
    }

    @Test
    public void test23() {
        assertEquals(3, BitCounting.countBits2(7));
    }

    @Test
    public void test24() {
        assertEquals(2, BitCounting.countBits2(9));
    }

    @Test
    public void test25() {
        assertEquals(2, BitCounting.countBits2(10));
    }
}