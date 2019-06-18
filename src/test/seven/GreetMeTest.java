package seven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetMeTest {

    @Test
    public void test0() {
        assertEquals(GreetMe.greet("riley"), "Hello Riley!");
    }

    @Test
    public void test1() {
        assertEquals(GreetMe.greet("BILLY"), "Hello Billy!");
    }
}