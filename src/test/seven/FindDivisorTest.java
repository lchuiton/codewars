package seven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindDivisorTest {

    @Test
    public void testSomething() {
        assertEquals(24, FindDivisor.numberOfDivisors(360));
    }
}