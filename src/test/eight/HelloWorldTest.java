package eight;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

// TODO: Replace examples and use TDD development by writing your own tests

public class HelloWorldTest {

  @Test
  public void testSomething() {
    assertEquals("Hello World", HelloWorld.greet());
  }
}