package seven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseLongerTest {

    @Test
    public void static1() {
        assertEquals("abcdetsrifabcde", ReverseLonger.shorterReverseLonger("first", "abcde"));
        assertEquals("bauollehbau", ReverseLonger.shorterReverseLonger("hello", "bau"));
        assertEquals("fghiedcbafghi", ReverseLonger.shorterReverseLonger("abcde", "fghi"));
    }

}
