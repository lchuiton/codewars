package four;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecretDetectiveTest {

    private SecretDetective detective;

    @BeforeEach
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