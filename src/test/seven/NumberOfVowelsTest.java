package seven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfVowelsTest {

    @Test
    public void testCase1() {
        assertEquals(5, NumberOfVowels.getCount("abracadabra"), "Nope!");
    }
}
