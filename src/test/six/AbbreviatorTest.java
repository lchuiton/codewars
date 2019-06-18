package six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbbreviatorTest {

    private final Abbreviator abbr = new Abbreviator();

    @Test
    public void testInternationalization() {
        assertEquals("i18n", abbr.abbreviate("internationalization"));
    }

    @Test
    public void test2() {
        assertEquals("e6t r2e", abbr.abbreviate("elephant ride"));
    }

    @Test
    public void test3() {
        assertEquals("e6t-r2e", abbr.abbreviate("elephant-ride"));
    }

    @Test
    public void test4() {
        assertEquals("the-m8c: a; is: a", abbr.abbreviate("the-monolithic: a; is: a"));
    }

    @Test
    public void test5() {
        assertEquals("You n2d, n2d not w2t, to c6e t2s c2e-w2s m5n", abbr.abbreviate("You need, need not want, to complete this code-wars mission"));
    }

}
