package eight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class HelloWorldTest {

    @Test
    public void testSomething() {
        assertEquals("Hello World", HelloWorld.greet());
    }
}