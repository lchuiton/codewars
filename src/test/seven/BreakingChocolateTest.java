package seven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BreakingChocolateTest {

    @Test
    public void test0() {
        assertEquals(BreakingChocolate.breakChocolate(0, 0), 0);
    }

    @Test
    public void test1() {
        assertEquals(BreakingChocolate.breakChocolate(5, 5), 24);
    }

    @Test
    public void test2() {
        assertEquals(BreakingChocolate.breakChocolate(1, 1), 0);
    }
}
