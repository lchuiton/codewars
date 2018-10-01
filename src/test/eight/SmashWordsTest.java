package eight;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class SmashWordsTest {

    @Test
    public void validate() {
        assertEquals("Bilal Djaghout", SmashWords.smash("Bilal", "Djaghout"));
    }

    @Test
    public void validateEmpty() {
        assertEquals("", SmashWords.smash());
    }

    @Test
    public void validateNull() {
        assertNull(SmashWords.smash((String[]) null));
    }

    @Test
    public void validateOneWord() {
        assertEquals("Bilal", SmashWords.smash("Bilal"));
    }

}
