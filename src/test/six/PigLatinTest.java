package six;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PigLatinTest {

    private PigLatin p;

    @BeforeEach
    public void setUp() {
        p = new PigLatin();

    }

    @Test
    public void testMap() {
        assertEquals("apmay", p.translate("map"));
    }

    @Test
    public void testegg() {
        assertEquals("eggway", p.translate("egg"));
    }

    @Test
    public void testspaghetti() {
        assertEquals("aghettispay", p.translate("spaghetti"));
    }

    @Test
    public void testSansVoyelle() {
        assertEquals("rtlay", p.translate("rtl"));
    }

    @Test
    public void testAvecCaractereNonAlphabetique() {
        assertNull(p.translate("2rtl"));
    }
}
