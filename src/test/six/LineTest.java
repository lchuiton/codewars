package six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LineTest {

    @Test
    public void test1() {
        assertEquals("YES", Line.sellTickets(new int[]{25, 25, 50}));
    }

    @Test
    public void test2() {
        assertEquals("NO", Line.sellTickets(new int[]{25, 100}));
    }

    @Test
    public void test3() {
        assertEquals("NO", Line.sellTickets(new int[]{25, 25, 25, 25, 25, 100, 100}));
    }
}