package six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitalRootTest {

    @Test
    public void test1() {
        assertEquals(DigitalRoot.calculate(16), 7, "Nope!");
    }

    @Test
    public void test2() {
        assertEquals(DigitalRoot.calculate(942), 6, "Nope!");
    }

    @Test
    public void test3() {
        assertEquals(DigitalRoot.calculate(132189), 6, "Nope!");
    }

    @Test
    public void test4() {
        assertEquals(DigitalRoot.calculate(493193), 2, "Nope!");
    }
}
