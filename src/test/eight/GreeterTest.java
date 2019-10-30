package eight;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreeterTest {

  @Test
  public void Test() {
    assertEquals("should greet some people normally", Greeter.greet("Jim"), "Hello, Jim!");
    assertEquals("should greet some people normally", Greeter.greet("Jane"), "Hello, Jane!");
    assertEquals("should greet some people normally", Greeter.greet("Simon"), "Hello, Simon!");
    assertEquals(
        "should greet Johnny a little bit more special",
        Greeter.greet("Johnny"),
        "Hello, my love!");
  }
}
