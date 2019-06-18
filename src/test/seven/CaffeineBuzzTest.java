package seven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaffeineBuzzTest {

    @Test
    public void test1() {
        assertEquals("mocha_missing!", CaffeineBuzz.caffeineBuzz(1));
        assertEquals("Java", CaffeineBuzz.caffeineBuzz(3));
        assertEquals("JavaScript", CaffeineBuzz.caffeineBuzz(6));
        assertEquals("CoffeeScript", CaffeineBuzz.caffeineBuzz(12));
    }
}