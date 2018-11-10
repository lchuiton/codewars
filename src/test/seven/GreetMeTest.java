package seven;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

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