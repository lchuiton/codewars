package eight;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {

  @Test
  public void testSomething() {
    assertEquals("Hello World", HelloWorld.greet());
  }
}
