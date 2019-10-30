package four;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SecretDetectiveTest {

    private SecretDetective detective;

    @Before
    public void setup() {
        detective = new SecretDetective();
    }

    @Test
    public void secret1() {
        // @formatter:off
        char[][] triplets = {
                {'t', 'u', 'p'},
                {'w', 'h', 'i'},
                {'t', 's', 'u'},
                {'a', 't', 's'},
                {'h', 'a', 'p'},
                {'t', 'i', 's'},
                {'w', 'h', 's'}};
        // @formatter:on
        assertEquals("whatisup", detective.recoverSecret(triplets));
    }
}