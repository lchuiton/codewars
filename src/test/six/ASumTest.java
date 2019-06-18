package six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ASumTest {

    @Test
    public void test0() {
        assertEquals(1, ASum.findNb(1));
    }

    @Test
    public void test00() {
        assertEquals(2, ASum.findNb(9));
    }

    @Test
    public void test000() {
        assertEquals(-1, ASum.findNb(101));
    }

    @Test
    public void test1() {
        assertEquals(2022, ASum.findNb(4183059834009L));
    }

    @Test
    public void test2() {
        assertEquals(-1, ASum.findNb(24723578342962L));
    }

    @Test
    public void test3() {
        assertEquals(4824, ASum.findNb(135440716410000L));
    }

    @Test
    public void test4() {
        assertEquals(3568, ASum.findNb(40539911473216L));
    }

    @Test
    public void test5() {
        assertEquals(53214, ASum.findNb(2004748753931165025L));
    }

}
