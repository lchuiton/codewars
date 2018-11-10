package six;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DigitalRootTest {

  @Test
  public void test1() {
    assertEquals("Nope!", DigitalRoot.calculate(16), 7);
  }

  @Test
  public void test2() {
    assertEquals("Nope!", DigitalRoot.calculate(942), 6);
  }

  @Test
  public void test3() {
    assertEquals("Nope!", DigitalRoot.calculate(132189), 6);
  }

  @Test
  public void test4() {
    assertEquals("Nope!", DigitalRoot.calculate(493193), 2);
  }
}
