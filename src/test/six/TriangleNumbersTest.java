package six;

import org.junit.jupiter.api.Test;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleNumbersTest {

    @Test
    public void test1() {
        assertEquals(TRUE, TriangleNumbers.isTriangleNumber(125250));
    }

    @Test
    public void test2() {
        assertEquals(TRUE, TriangleNumbers.isTriangleNumber(3126250));
    }

    @Test
    public void test3() {
        assertEquals(TRUE, TriangleNumbers.isTriangleNumber(6));
    }

    @Test
    public void test4() {
        assertEquals(FALSE, TriangleNumbers.isTriangleNumber(7));
    }
}