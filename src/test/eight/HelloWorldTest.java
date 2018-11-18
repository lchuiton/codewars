package eight;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class HelloWorldTest {

  @Test
  public void testSomething() {
    assertEquals("Hello World", HelloWorld.greet());
  }
}